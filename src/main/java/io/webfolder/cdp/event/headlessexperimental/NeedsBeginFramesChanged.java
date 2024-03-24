package io.webfolder.cdp.event.headlessexperimental;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Issued when the target starts or stops needing BeginFrames
 */
@Domain("HeadlessExperimental")
@EventName("needsBeginFramesChanged")
@Data
public class NeedsBeginFramesChanged {

    /**
     * True if BeginFrames are needed, false otherwise.
     */
    private Boolean needsBeginFrames;

}
