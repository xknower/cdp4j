package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.target.TargetInfo;
import lombok.Data;

/**
 * Issued when some information about a target has changed
 * This only happens between
 * <code>targetCreated</code> and <code>targetDestroyed</code>
 */
@Domain("Target")
@EventName("targetInfoChanged")
@Data
public class TargetInfoChanged {

    private TargetInfo targetInfo;

}
