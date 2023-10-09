package io.webfolder.cdp.session;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.neovisionaries.ws.client.WebSocket;
import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.logger.CdpLogger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.format;
import static java.util.Base64.getDecoder;

class SessionInvocationHandler implements InvocationHandler {

    private final AtomicInteger counter = new AtomicInteger(0);

    private final Gson gson;

    private final WebSocket webSocket;

    private final Map<Integer, WSContext> contexts;

    private final List<String> enabledDomains = new CopyOnWriteArrayList<>();

    private final CdpLogger log;

    private final Session session;

    private final boolean browserSession;

    private final String sessionId;

    private final String targetId;

    private final int timeout;

    SessionInvocationHandler(
            final Gson gson,
            final WebSocket webSocket,
            final Map<Integer, WSContext> contexts,
            final Session session,
            final CdpLogger log,
            final boolean browserSession,
            final String sessionId,
            final String targetId,
            final int webSocketReadTimeout) {
        this.gson = gson;
        this.webSocket = webSocket;
        this.contexts = contexts;
        this.session = session;
        this.log = log;
        this.browserSession = browserSession;
        this.sessionId = sessionId;
        this.targetId = targetId;
        this.timeout = webSocketReadTimeout;
    }

    @Override
    public Object invoke(
            final Object proxy,
            final Method method,
            final Object[] args) throws Throwable {

        final Class<?> klass = method.getDeclaringClass();
        final String domain = klass.getAnnotation(Domain.class).value();
        final String command = method.getName();

        final boolean hasArgs = args != null && args.length > 0;
        final boolean voidMethod = void.class.equals(method.getReturnType());

        boolean enable = "enable".intern() == command && voidMethod;

        // it's unnecessary to call enable command more than once.
        if (enable && enabledDomains.contains(domain)) {
            return null;
        }

        boolean disable = "disable".intern() == command && voidMethod;

        if (disable) {
            enabledDomains.remove(domain);
        }

        Map<String, Object> params = new HashMap<>(hasArgs ? args.length : 0);

        if (hasArgs) {
            int argIndex = 0;
            Parameter[] parameters = method.getParameters();
            for (Object argValue : args) {
                String argName = parameters[argIndex++].getName();
                params.put(argName, argValue);
            }
        }

        int id = counter.incrementAndGet();
        Map<String, Object> map = new HashMap<>(3);
        map.put("id", id);
        map.put("method", format("%s.%s", domain, command));
        map.put("params", params);

        String json = gson.toJson(map);

        log.debug(json);

        WSContext context = null;

        if (session.isConnected()) {
            context = new WSContext();
            contexts.put(id, context);
            if (browserSession) {
                webSocket.sendText(json);
            } else {
                session.getCommand()
                        .getTarget()
                        .sendMessageToTarget(json, sessionId, targetId);
            }
            context.await(timeout);
        } else {
            throw new CdpException("WebSocket connection is not alive. id: " + id);
        }

        if (context.getError() != null) {
            throw context.getError();
        }

        if (enable) {
            enabledDomains.add(domain);
        }

        Class<?> retType = method.getReturnType();

        if (voidMethod || retType.equals(Void.class)) {
            return null;
        }

        JsonElement data = context.getData();

        String returns = method.isAnnotationPresent(Returns.class) ?
                method.getAnnotation(Returns.class).value() : null;

        if (data == null) {
            return null;
        }

        if (!data.isJsonObject()) {
            throw new CdpException("invalid response");
        }

        JsonObject object = data.getAsJsonObject();
        JsonElement result = object.get("result");

        if (result == null || !result.isJsonObject()) {
            throw new CdpException("invalid result");
        }

        JsonObject resultObject = result.getAsJsonObject();

        Object ret = null;
        Type genericReturnType = method.getGenericReturnType();

        if (returns != null) {

            JsonElement jsonElement = resultObject.get(returns);

            if (jsonElement != null && jsonElement.isJsonPrimitive()) {
                if (String.class.equals(retType)) {
                    return resultObject.get(returns).getAsString();
                } else if (Boolean.class.equals(retType)) {
                    return resultObject.get(returns).getAsBoolean() ? Boolean.TRUE : Boolean.FALSE;
                } else if (Integer.class.equals(retType)) {
                    return resultObject.get(returns).getAsInt();
                } else if (Double.class.equals(retType)) {
                    return resultObject.get(returns).getAsDouble();
                }
            }

            if (jsonElement != null && byte[].class.equals(genericReturnType)) {
                String encoded = gson.fromJson(jsonElement, String.class);
                if (encoded == null || encoded.trim().isEmpty()) {
                    return null;
                } else {
                    return getDecoder().decode(encoded);
                }
            }

            if (List.class.equals(retType)) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                ret = gson.fromJson(jsonArray, genericReturnType);
            } else {
                ret = gson.fromJson(jsonElement, genericReturnType);
            }
        } else {
            ret = gson.fromJson(resultObject, genericReturnType);
        }

        return ret;
    }

    void dispose() {
        enabledDomains.clear();
        for (WSContext context : contexts.values()) {
            try {
                context.setData(null);
            } catch (Throwable t) {
            }
        }
    }

    WSContext getContext(int id) {
        return contexts.get(id);
    }
}
