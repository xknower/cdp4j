package io.webfolder.cdp.event.inspector;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when remote debugging connection is about to be terminated
 * Contains detach reason
 */
@Domain("Inspector")
@EventName("detached")
public class Detached {
    private String reason;

    /**
     * The reason why connection has been terminated.
     */
    public String getReason() {
        return reason;
    }

    /**
     * The reason why connection has been terminated.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
