package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Issued when a target has crashed
 */
@Domain("Target")
@EventName("targetCrashed")
@Data
public class TargetCrashed {

    private String targetId;
    /**
     * Termination status type.
     */
    private String status;
    /**
     * Termination error code.
     */
    private Integer errorCode;

}
