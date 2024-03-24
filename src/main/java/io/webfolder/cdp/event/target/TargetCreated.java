package io.webfolder.cdp.event.target;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.target.TargetInfo;
import lombok.Data;

/**
 * Issued when a possible inspection target is created
 */
@Domain("Target")
@EventName("targetCreated")
@Data
public class TargetCreated {

    private TargetInfo targetInfo;

}
