package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.session.SessionFactory;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.Thread.sleep;
import static java.util.Collections.emptyList;

abstract class AbstractLauncher {

    protected final SessionFactory factory;

    /**
     * 启动标识
     */
    private volatile boolean launched;

    private static final int SLEEP_DURATION = 100; // ms

    private static final int DEFAULT_CONNECTION_TIMEOUT = 5000; // ms

    public AbstractLauncher(final SessionFactory factory) {
        this.factory = factory;
    }

    protected List<String> getCommonParameters(String chromeExecutablePath, List<String> arguments) {
        List<String> list = new ArrayList<>();
        list.add(chromeExecutablePath);

        if (factory.getPort() > 0) {
            list.add(format("--remote-debugging-port=%d", factory.getPort()));
        }

        // Disable built-in Google Translate service
        list.add("--disable-features=TranslateUI");
        // Disable all chrome extensions entirely
        list.add("--disable-extensions");
        // Disable various background network services, including extension updating,
        // safe browsing service, upgrade detector, translate, UMA
        list.add("--disable-background-networking");
        // Disable fetching safebrowsing lists, likely redundant due to disable-background-networking
        list.add("--safebrowsing-disable-auto-update");
        // Disable syncing to a Google account
        list.add("--disable-sync");
        // Disable reporting to UMA, but allows for collection
        list.add("--metrics-recording-only");
        // Disable installation of default apps on first run
        list.add("--disable-default-apps");
        // Mute any audio
        list.add("--mute-audio");
        // Skip first run wizards
        list.add("--no-first-run");
        list.add("--no-default-browser-check");
        list.add("--disable-plugin-power-saver");
        list.add("--disable-popup-blocking");

        if (!arguments.isEmpty()) {
            list.addAll(arguments);
        }
        return list;
    }

    public abstract String findChrome();

    public boolean launched() {
        return launched;
    }

    public final SessionFactory launch() {
        return launch(emptyList());
    }

    public final SessionFactory launch(List<String> arguments) {
        if (factory.ping()) { // 判断是否已经启动
            return factory;
        }
        return launch(findChrome(), arguments);
    }

    public final SessionFactory launch(String chromeExecutablePath, List<String> arguments) {
        return launch(chromeExecutablePath, arguments, DEFAULT_CONNECTION_TIMEOUT);
    }

    /**
     * 启动入口
     *
     * @param chromeExecutablePath chrome执行文件路径
     * @param arguments            chrome执行参数
     * @param connectionTimeout    连接超时时间
     * @return SessionFactory
     */
    public final SessionFactory launch(String chromeExecutablePath, List<String> arguments, int connectionTimeout) {
        if (chromeExecutablePath == null || chromeExecutablePath.trim().isEmpty()) {
            throw new CdpException("chrome not found");
        }
        if (connectionTimeout < SLEEP_DURATION) {
            throw new IllegalArgumentException();
        }
        if (connectionTimeout % SLEEP_DURATION != 0) {
            throw new IllegalArgumentException();
        }
        if (!launched) {
            List<String> list = getCommonParameters(chromeExecutablePath, arguments);
            internalLaunch(list, arguments); // 执行启动
            launched = true;
        }

        int retryCount = 0;
        boolean connected;

        int maxRetryCount = connectionTimeout / (int) SLEEP_DURATION;
        while (!(connected = factory.ping()) && retryCount < maxRetryCount) { // 检测启动状态
            try {
                sleep(SLEEP_DURATION);
            } catch (InterruptedException e) {
                // ignore
            }
            retryCount += 1;
        }

        if (!connected) {
            throw new CdpException("Unable to connect to the browser");
        }

        return factory;
    }

    /**
     * 内部启动业务
     *
     * @param list   chrome启动参数全量参数
     * @param params 命令行传入参数
     */
    protected abstract void internalLaunch(List<String> list, List<String> params);

    public abstract void kill();

}
