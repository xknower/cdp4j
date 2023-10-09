package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.Initiator;

/**
 * Fired upon WebSocket creation
 */
@Domain("Network")
@EventName("webSocketCreated")
public class WebSocketCreated {
    private String requestId;

    private String url;

    private Initiator initiator;

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
     * WebSocket request URL.
     */
    public String getUrl() {
        return url;
    }

    /**
     * WebSocket request URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Request initiator.
     */
    public Initiator getInitiator() {
        return initiator;
    }

    /**
     * Request initiator.
     */
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }
}
