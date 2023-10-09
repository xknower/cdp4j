package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.WebSocketFrame;

/**
 * Fired when WebSocket frame is sent
 */
@Domain("Network")
@EventName("webSocketFrameSent")
public class WebSocketFrameSent {
    private String requestId;

    private Double timestamp;

    private WebSocketFrame response;

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
     * WebSocket response data.
     */
    public WebSocketFrame getResponse() {
        return response;
    }

    /**
     * WebSocket response data.
     */
    public void setResponse(WebSocketFrame response) {
        this.response = response;
    }
}
