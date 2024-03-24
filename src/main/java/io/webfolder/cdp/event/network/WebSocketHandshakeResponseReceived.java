package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.WebSocketResponse;
import lombok.Data;

/**
 * Fired when WebSocket handshake response becomes available
 */
@Domain("Network")
@EventName("webSocketHandshakeResponseReceived")
@Data
public class WebSocketHandshakeResponseReceived {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * WebSocket response data.
     */
    private WebSocketResponse response;

}
