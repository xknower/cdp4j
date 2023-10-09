package io.webfolder.cdp.type.network;

import java.util.HashMap;
import java.util.Map;

/**
 * WebSocket request data
 */
public class WebSocketRequest {
    private Map<String, Object> headers = new HashMap<>();

    /**
     * HTTP request headers.
     */
    public Map<String, Object> getHeaders() {
        return headers;
    }

    /**
     * HTTP request headers.
     */
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }
}
