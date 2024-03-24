package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.Initiator;
import lombok.Data;

/**
 * Fired upon WebSocket creation
 */
@Domain("Network")
@EventName("webSocketCreated")
@Data
public class WebSocketCreated {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * WebSocket request URL.
     */
    private String url;
    /**
     * Request initiator.
     */
    private Initiator initiator;

}
