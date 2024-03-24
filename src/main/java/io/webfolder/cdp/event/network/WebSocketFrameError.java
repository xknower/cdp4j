package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when WebSocket frame error occurs
 */
@Domain("Network")
@EventName("webSocketFrameError")
@Data
public class WebSocketFrameError {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * WebSocket frame error message.
     */
    private String errorMessage;

}
