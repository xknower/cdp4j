package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.target.TargetInfo;
import lombok.Data;

/**
 * Issued when attached to target because of auto-attach or <code>attachToTarget</code> command
 */
@Experimental
@Domain("Target")
@EventName("attachedToTarget")
@Data
public class AttachedToTarget {

    /**
     * Identifier assigned to the session used to send/receive messages.
     */
    private String sessionId;

    private TargetInfo targetInfo;

    private Boolean waitingForDebugger;

}
