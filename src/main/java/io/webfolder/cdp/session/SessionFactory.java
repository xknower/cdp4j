package io.webfolder.cdp.session;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.neovisionaries.ws.client.ProxySettings;
import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketFactory;
import com.neovisionaries.ws.client.ZeroMasker;
import io.webfolder.cdp.command.Target;
import io.webfolder.cdp.event.runtime.ExecutionContextCreated;
import io.webfolder.cdp.event.runtime.ExecutionContextDestroyed;
import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.listener.EventListener;
import io.webfolder.cdp.logger.CdpLoggerFactory;
import io.webfolder.cdp.logger.CdpLoggerType;
import io.webfolder.cdp.logger.LoggerFactory;
import io.webfolder.cdp.type.target.TargetInfo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static io.webfolder.cdp.event.Events.RuntimeExecutionContextCreated;
import static io.webfolder.cdp.event.Events.RuntimeExecutionContextDestroyed;
import static io.webfolder.cdp.logger.CdpLoggerType.Slf4j;
import static java.lang.Boolean.TRUE;
import static java.lang.String.format;
import static java.lang.Thread.sleep;
import static java.util.Locale.ENGLISH;
import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * 会话工厂，创建Session并初始化管理业务流程
 * - 1. 创建Session
 * - 2. 连接Websocket
 */
public class SessionFactory implements AutoCloseable {

    public final static String DEFAULT_HOST = "localhost";

    public final static int DEFAULT_PORT = 9222;

    private final String host;

    private final int port;

    private final int connectionTimeout;

    private final WebSocketFactory factory;

    private final Gson gson;

    private final LoggerFactory loggerFactory;

    private static final int DEFAULT_CONNECTION_TIMEOUT = 60 * 1000; // 60 seconds

    private static final int DEFAULT_WS_READ_TIMEOUT = 10 * 1000; // 10 seconds

    private final Map<String, Session> sessions = new ConcurrentHashMap<>();

    private final Map<String, WSAdapter> wsAdapters = new ConcurrentHashMap<>();

    private final List<String> contexts = new CopyOnWriteArrayList<>();

    private final List<TabInfo> tabs = new CopyOnWriteArrayList<>();

    private final ExecutorService threadPool;

    private WebSocket webSocket;

    private volatile Session browserSession;

    private volatile boolean closed;

    private volatile Boolean headless;

    private volatile int webSocketReadTimeout = DEFAULT_WS_READ_TIMEOUT;

    private volatile int majorVersion;

    private Proxy httpClientProxy;

    public SessionFactory() {
        this(DEFAULT_HOST,
                DEFAULT_PORT,
                DEFAULT_CONNECTION_TIMEOUT,
                Slf4j,
                newCachedThreadPool(new CdpThreadFactory()));
    }

    public SessionFactory(CdpLoggerType loggerType) {
        this(DEFAULT_HOST,
                DEFAULT_PORT,
                DEFAULT_CONNECTION_TIMEOUT,
                loggerType,
                newCachedThreadPool(new CdpThreadFactory()));
    }

    public SessionFactory(final int port) {
        this(DEFAULT_HOST,
                port,
                DEFAULT_CONNECTION_TIMEOUT,
                Slf4j,
                newCachedThreadPool(new CdpThreadFactory()));
    }

    public SessionFactory(final int port, CdpLoggerType loggerType) {
        this(DEFAULT_HOST,
                port,
                DEFAULT_CONNECTION_TIMEOUT,
                loggerType,
                newCachedThreadPool(new CdpThreadFactory()));
    }

    public SessionFactory(final String host, final int port) {
        this(host,
                port,
                DEFAULT_CONNECTION_TIMEOUT,
                Slf4j,
                newCachedThreadPool(new CdpThreadFactory()));
    }

    public SessionFactory(
            final String host,
            final int port,
            final CdpLoggerType loggerType,
            final ExecutorService threadPool) {
        this(host,
                port,
                DEFAULT_CONNECTION_TIMEOUT,
                loggerType,
                threadPool);
    }

    public SessionFactory(
            final String host,
            final int port,
            final int connectionTimeout,
            final CdpLoggerType loggerType,
            final ExecutorService threadPool) {
        this.host = host;
        this.port = port;
        this.connectionTimeout = connectionTimeout;
        this.factory = new WebSocketFactory();
        this.loggerFactory = createLoggerFactory(loggerType);
        this.threadPool = threadPool;
        this.gson = new GsonBuilder()
                .disableHtmlEscaping()
                .create();
        this.factory.setConnectionTimeout(this.connectionTimeout);
        if (ThreadPoolExecutor.class.isAssignableFrom(threadPool.getClass())) {
            ((ThreadPoolExecutor) threadPool).setKeepAliveTime(5, SECONDS);
        }
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public Session create() {
        return create(null, new SessionSettings());
    }

    public Session create(SessionSettings sessionSettings) {
        return create(null, sessionSettings);
    }

    public Session create(String browserContextId) {
        return create(browserContextId, new SessionSettings());
    }

    /**
     * 创建Session，初始化Websocket；执行 {@link #connect(String, String)}
     *
     * @param browserContextId 浏览器上下文ID
     * @param sessionSettings  Session配置
     * @return Session
     */
    public Session create(String browserContextId, SessionSettings sessionSettings) {
        boolean initialized = browserSession == null ? false : true;

        // 1. 创建获取Session，并初始化连接websocket
        Session browserSession = getBrowserSession();

        // 2. 等待Websocket完成，获取或创建一个标签页
        Target target = browserSession.getCommand().getTarget();

        TabInfo tab = null;

        // 第一次创建Session，监听等待 websocket 连接完成，并等待一段时间获取第一个Tab信息
        if (!initialized) {
            for (int i = 0; i < 500 && tabs.isEmpty(); i++) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new CdpException(e);
                }
            }
            if (!tabs.isEmpty()) {
                tab = tabs.remove(0);
            }
        }

        // 未获取到则主动创建一个空白页
        if (tab == null) {
            String targetId = target.createTarget("about:blank",
                    sessionSettings.getScreenWidth(),
                    sessionSettings.getScreenHeight(),
                    browserContextId, false);
            boolean found = false;
            for (int i = 0; i < 500 && !found; i++) {
                for (TabInfo info : tabs) {
                    if (info.getTargetId().equals(targetId)) {
                        found = true;
                        tabs.remove(info);
                        break;
                    }
                }
                if (!found) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new CdpException(e);
                    }
                }
            }

            tab = new TabInfo(targetId, browserContextId);
        }

        // 3. 执行连接
        return connect(tab.getTargetId(), tab.getBrowserContextId());
    }

    public Session connect(String targetId) {
        return connect(targetId, null);
    }

    /**
     * @param targetId         目标ID
     * @param browserContextId 浏览器会话ID
     * @return Session
     */
    Session connect(String targetId, String browserContextId) {
        // 1. 获取主会话，未存在则创建
        Session bs = getBrowserSession();

        if (browserContextId == null) {
            TargetInfo found = null;
            List<TargetInfo> targets = bs.getCommand().getTarget().getTargets();
            for (TargetInfo next : targets) {
                if (next.getTargetId().equals(targetId)) {
                    found = next;
                }
            }
            if (found == null) {
                throw new CdpException("Target not found: " + targetId);
            }
            browserContextId = found.getBrowserContextId();
        }

        // 2. 会话ID，并初始化一个会话
        Target target = bs.getCommand().getTarget();
        String sessionId = target.attachToTarget(targetId);

        Map<Integer, WSContext> contexts = new ConcurrentHashMap<>();
        List<EventListener> listeners = new CopyOnWriteArrayList<>();

        Session session = new Session(gson, sessionId,
                targetId, browserContextId,
                webSocket, contexts,
                this, listeners,
                loggerFactory, false,
                browserSession, getMajorVersion());
        WSAdapter wsAdapter = new WSAdapter(gson, contexts,
                listeners, threadPool,
                loggerFactory.getLogger("cdp4j.ws.response"));
        wsAdapter.setSession(session);
        wsAdapters.put(sessionId, wsAdapter);
        sessions.put(sessionId, session);

        // 监听会话上下文事件，并获取设置 executionContextId
        session.getCommand().getRuntime().enable();

        session.addEventListener((event, value) -> {
            if (RuntimeExecutionContextCreated.equals(event)) {
                ExecutionContextCreated ecc = (ExecutionContextCreated) value;
                if (targetId.equals(ecc.getContext().getAuxData().get("frameId"))) {
                    session.setExecutionContextId(ecc.getContext().getId());
                }
            } else if (RuntimeExecutionContextDestroyed.equals(event)) {
                ExecutionContextDestroyed ecd = (ExecutionContextDestroyed) value;
                if (ecd.getExecutionContextId() != null &&
                        ecd.getExecutionContextId().equals(session.getExecutionContextId())) {
                    session.setExecutionContextId(null);
                }
            }
        });

        // 设置该会话检查器

        Command command = session.getCommand();

        command.getInspector().enable();
        command.getPage().enable();
        command.getPage().setLifecycleEventsEnabled(true);

        return session;
    }

    /**
     * 创建获取Session
     *
     * @return Session
     */
    private synchronized Session getBrowserSession() {
        if (browserSession == null) {
            // 1. HTTP请求获取信息
            Map<String, Object> version = getVersion();
            String webSocketDebuggerUrl = (String) version.get("webSocketDebuggerUrl");
            // 2. 创建 websocket 连接
            webSocket = null;
            try {
                webSocket = factory.createSocket(webSocketDebuggerUrl);
                webSocket.setPayloadMask(new ZeroMasker());
            } catch (IOException e) {
                throw new CdpException(e);
            }
            // 初始化 WSAdapter 适配器，并设置 websocket Listener
            Map<Integer, WSContext> contexts = new ConcurrentHashMap<>();
            List<EventListener> listeners = new CopyOnWriteArrayList<>();
            WSAdapter adapter = new WSAdapter(gson, contexts,
                    listeners, threadPool,
                    loggerFactory.getLogger("cdp4j.ws.response"));
            webSocket.addListener(adapter);
            try {
                // 连接 websocket
                webSocket.connect();
            } catch (WebSocketException e) {
                throw new CdpException(e);
            }
            webSocket.setAutoFlush(true);

            // 3. 构建Session实例，设置 session id 和 target id
            browserSession = new Session(gson, webSocketDebuggerUrl,
                    webSocketDebuggerUrl, null,
                    webSocket, contexts,
                    this, listeners,
                    loggerFactory, true,
                    null, 0);
            adapter.setSession(browserSession);
            // Session添加目标监听器
            browserSession.addEventListener(new TargetListener(sessions, wsAdapters, tabs));
            Target target = browserSession.getCommand().getTarget();
            target.setDiscoverTargets(TRUE);
            // Session添加关闭事件处理
            browserSession.onTerminate(event -> close());
        }
        return browserSession;
    }

    void close(Session session) {
        if (browserSession.isConnected()) {
            int version = getMajorVersion();
            if (version >= 68) {
                session
                        .getCommand()
                        .getPage()
                        .close();
            } else {
                browserSession
                        .getCommand()
                        .getTarget()
                        .closeTarget(session.getTargetId());
            }
        }
        session.dispose();
        wsAdapters.remove(session.getId());
        sessions.remove(session.getId());
    }

    private int getMajorVersion() {
        if (majorVersion == 0) {
            String[] product = browserSession
                    .getCommand()
                    .getBrowser()
                    .getVersion()
                    .getProduct()
                    .split("/");
            if (product.length == 2) {
                String[] version = product[1].split("\\.");
                if (version.length > 2) {
                    majorVersion = Integer.parseInt(version[0]);
                }
            }
        }
        return majorVersion;
    }

    @Override
    public void close() {
        if (closed) {
            return;
        }
        closed = true;
        if (browserSession != null) {
            browserSession.dispose();
        }
        sessions.clear();
        wsAdapters.clear();
        contexts.clear();
        tabs.clear();
        threadPool.shutdownNow();
        browserSession = null;
    }

    public void activate(String sessionId) {
        Session session = null;
        for (Session next : sessions.values()) {
            if (next.getId().equals(sessionId)) {
                session = next;
                break;
            }
        }
        if (session != null) {
            browserSession
                    .getCommand()
                    .getTarget()
                    .activateTarget(session.getTargetId());
        }
    }

    public boolean isHeadless() {
        if (headless == null) {
            headless = getBrowserSession()
                    .getCommand()
                    .getBrowser()
                    .getVersion()
                    .getProduct()
                    .toLowerCase(ENGLISH)
                    .contains("headless");
        }
        return headless.booleanValue();
    }

    private Map<String, Object> getVersion() {
        String sessions = format("http://%s:%d/json/version", host, port);
        URL url = null;
        Reader reader = null;
        try {
            url = new URL(sessions);
            HttpURLConnection conn = httpClientProxy != null ?
                    (HttpURLConnection) url.openConnection(httpClientProxy) :
                    (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(connectionTimeout);
            reader = new InputStreamReader(conn.getInputStream());
            @SuppressWarnings("unchecked")
            Map<String, Object> map = gson.fromJson(reader, Map.class);
            return map;
        } catch (ConnectException e) {
            throw new CdpException(format("Unable to connect [%s:%d]", host, port));
        } catch (IOException e) {
            throw new CdpException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }

    /**
     * 监测Chrome状态
     *
     * @return true 正常
     */
    public boolean ping() {
        String sessions = format("http://%s:%d/json/version",
                host,
                port);
        try {
            URL url = new URL(sessions);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            final int timeout = 500;
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            try (Reader reader = new InputStreamReader(conn.getInputStream())) {
                while (reader.read() != -1) {
                    // no op
                }
            }
            return conn.getResponseCode() == 200;
        } catch (ConnectException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public String createBrowserContext() {
        String browserContextId = getBrowserSession()
                .getCommand()
                .getTarget()
                .createBrowserContext();
        contexts.add(browserContextId);
        return browserContextId;
    }

    public void disposeBrowserContext(final String browserContextId) {
        if (contexts.contains(browserContextId)) {
            getBrowserSession()
                    .getCommand()
                    .getTarget()
                    .disposeBrowserContext(browserContextId);
            contexts.remove(browserContextId);
        }
    }

    ExecutorService getThreadPool() {
        return threadPool;
    }

    protected LoggerFactory createLoggerFactory(CdpLoggerType loggerType) {
        ServiceLoader<LoggerFactory> loader = ServiceLoader.<LoggerFactory>load(LoggerFactory.class);
        Iterator<LoggerFactory> iter = loader.iterator();
        if (iter.hasNext()) {
            return iter.next();
        } else {
            return new CdpLoggerFactory(loggerType);
        }
    }

    public int getWebSocketReadTimeout() {
        return webSocketReadTimeout;
    }

    public void setWebSocketReadTimeout(int webSocketReadTimeout) {
        this.webSocketReadTimeout = webSocketReadTimeout;
    }

    public ProxySettings getWebSocketProxySettings() {
        return factory.getProxySettings();
    }

    public void setHttpClientProxy(Proxy proxy) {
        this.httpClientProxy = proxy;
    }

    @Override
    public String toString() {
        return "SessionFactory [host=" + host + ", port=" + port + ", sessions=" + sessions + "]";
    }
}
