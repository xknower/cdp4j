package io.webfolder.cdp.type.network;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * WebSocket request data
 */
@Data
public class WebSocketRequest {

    /**
     * HTTP request headers.
     */
    private Map<String, Object> headers = new HashMap<>();

}
