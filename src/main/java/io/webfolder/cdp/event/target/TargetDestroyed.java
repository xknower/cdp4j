package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Issued when a target is destroyed
 */
@Domain("Target")
@EventName("targetDestroyed")
@Data
public class TargetDestroyed {

    private String targetId;

}
