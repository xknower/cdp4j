package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Notifies about a new protocol message received from the session (as reported in
 * <code>attachedToTarget</code> event)
 */
@Domain("Target")
@EventName("receivedMessageFromTarget")
@Data
public class ReceivedMessageFromTarget {

    /**
     * Identifier of a session which sends a message.
     */
    private String sessionId;

    private String message;
    /**
     * Deprecated.
     */
    private String targetId;

}
