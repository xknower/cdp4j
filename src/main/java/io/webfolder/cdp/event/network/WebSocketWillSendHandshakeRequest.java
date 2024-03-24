package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.WebSocketRequest;
import lombok.Data;

/**
 * Fired when WebSocket is about to initiate handshake
 */
@Domain("Network")
@EventName("webSocketWillSendHandshakeRequest")
@Data
public class WebSocketWillSendHandshakeRequest {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * UTC Timestamp.
     */
    private Double wallTime;
    /**
     * WebSocket request data.
     */
    private WebSocketRequest request;

}
