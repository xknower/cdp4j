package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.WebSocketFrame;
import lombok.Data;

/**
 * Fired when WebSocket frame is received
 */
@Domain("Network")
@EventName("webSocketFrameReceived")
@Data
public class WebSocketFrameReceived {

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
    private WebSocketFrame response;

}
