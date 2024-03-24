package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when EventSource message is received
 */
@Domain("Network")
@EventName("eventSourceMessageReceived")
@Data
public class EventSourceMessageReceived {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * Message type.
     */
    private String eventName;
    /**
     * Message identifier.
     */
    private String eventId;
    /**
     * Message content.
     */
    private String data;

}
