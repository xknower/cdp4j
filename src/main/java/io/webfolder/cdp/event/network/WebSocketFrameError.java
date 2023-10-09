package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when WebSocket frame error occurs
 */
@Domain("Network")
@EventName("webSocketFrameError")
public class WebSocketFrameError {
    private String requestId;

    private Double timestamp;

    private String errorMessage;

    /**
     * Request identifier.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Request identifier.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * WebSocket frame error message.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * WebSocket frame error message.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
