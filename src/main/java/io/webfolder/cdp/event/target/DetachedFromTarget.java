package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Issued when detached from target for any reason (including <code>detachFromTarget</code> command)
 * Can be
 * issued multiple times per target if multiple sessions have been attached to it
 */
@Experimental
@Domain("Target")
@EventName("detachedFromTarget")
@Data
public class DetachedFromTarget {

    /**
     * Detached session identifier.
     */
    private String sessionId;
    /**
     * Deprecated.
     */
    private String targetId;

}
