package io.webfolder.cdp.event.inspector;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when remote debugging connection is about to be terminated
 * Contains detach reason
 */
@Domain("Inspector")
@EventName("detached")
@Data
public class Detached {

    /**
     * The reason why connection has been terminated.
     */
    private String reason;

}
