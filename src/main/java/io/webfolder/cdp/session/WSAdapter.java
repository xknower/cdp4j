package io.webfolder.cdp.session;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import io.webfolder.cdp.event.Events;
import io.webfolder.cdp.exception.CommandException;
import io.webfolder.cdp.listener.EventListener;
import io.webfolder.cdp.logger.CdpLogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import static java.lang.Integer.parseInt;
import static java.util.Collections.unmodifiableMap;

class WSAdapter extends WebSocketAdapter {

    private final Map<String, Events> events = listEvents();

    private final Gson gson;

    private final Map<Integer, WSContext> contexts;

    private final List<EventListener> listeners;

    private final Executor executor;

    private final CdpLogger log;

    private Session session;

    private static class TerminateSession implements Runnable {

        private final Session session;

        private final JsonObject object;

        public TerminateSession(final Session session, final JsonObject object) {
            this.session = session;
            this.object = object;
        }

        @Override
        public void run() {
            if (session != null && session.isConnected()) {
                session.close();
                session.terminate(
                        object.get("params")
                                .getAsJsonObject()
                                .get("reason").getAsString());
            }
        }
    }

    WSAdapter(
            final Gson gson,
            final Map<Integer, WSContext> contexts,
            final List<EventListener> listeners,
            final Executor executor,
            final CdpLogger log) {
        this.gson = gson;
        this.contexts = contexts;
        this.listeners = listeners;
        this.executor = executor;
        this.log = log;
    }

    @Override
    public void onTextMessage(
            final WebSocket websocket,
            final String data) throws Exception {
        onMessage(data, true);
    }

    void onMessage(final String data, boolean async) throws Exception {
        Runnable runnable = () -> {
            log.debug(data);
            JsonElement json = gson.fromJson(data, JsonElement.class);
            JsonObject object = json.getAsJsonObject();
            JsonElement idElement = object.get("id");
            if (idElement != null) {
                String id = idElement.getAsString();
                if (id != null) {
                    int valId = parseInt(id);
                    WSContext context = contexts.remove(valId);
                    if (context != null) {
                        JsonObject error = object.getAsJsonObject("error");
                        if (error != null) {
                            int code = (int) error.getAsJsonPrimitive("code").getAsDouble();
                            String message = error.getAsJsonPrimitive("message").getAsString();
                            JsonElement messageData = error.get("data");
                            context.setError(new CommandException(code, message +
                                    (messageData != null && messageData.isJsonPrimitive() ? ". " +
                                            messageData.getAsString() : "")));
                        } else {
                            context.setData(json);
                        }
                    }
                }
            } else {
                JsonElement method = object.get("method");
                if (method != null && method.isJsonPrimitive()) {
                    String eventName = method.getAsString();
                    if ("Inspector.detached".equals(eventName) && session != null) {
                        if (session != null && session.isConnected()) {
                            Thread thread = new Thread(new TerminateSession(session, object));
                            thread.setName("cdp4j-terminate");
                            thread.setDaemon(true);
                            thread.start();
                            session = null;
                        }
                    } else {
                        Events event = events.get(eventName);
                        if (event != null) {
                            JsonElement params = object.get("params");
                            Object value = gson.fromJson(params, event.klass);
                            for (EventListener next : listeners) {
                                executor.execute(() -> {
                                    next.onEvent(event, value);
                                });
                            }
                        }
                    }
                }
            }
        };
        if (async) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    Map<String, Events> listEvents() {
        Map<String, Events> map = new HashMap<>();
        for (Events next : Events.values()) {
            map.put(next.domain + "." + next.name, next);
        }
        return unmodifiableMap(map);
    }

    void setSession(final Session session) {
        this.session = session;
    }
}
