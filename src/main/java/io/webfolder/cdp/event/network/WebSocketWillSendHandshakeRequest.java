package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.WebSocketRequest;

/**
 * Fired when WebSocket is about to initiate handshake
 */
@Domain("Network")
@EventName("webSocketWillSendHandshakeRequest")
public class WebSocketWillSendHandshakeRequest {
    private String requestId;

    private Double timestamp;

    private Double wallTime;

    private WebSocketRequest request;

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
     * UTC Timestamp.
     */
    public Double getWallTime() {
        return wallTime;
    }

    /**
     * UTC Timestamp.
     */
    public void setWallTime(Double wallTime) {
        this.wallTime = wallTime;
    }

    /**
     * WebSocket request data.
     */
    public WebSocketRequest getRequest() {
        return request;
    }

    /**
     * WebSocket request data.
     */
    public void setRequest(WebSocketRequest request) {
        this.request = request;
    }
}
