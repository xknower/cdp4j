package io.webfolder.cdp.event.headlessexperimental;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Issued when the target starts or stops needing BeginFrames
 */
@Domain("HeadlessExperimental")
@EventName("needsBeginFramesChanged")
public class NeedsBeginFramesChanged {
    private Boolean needsBeginFrames;

    /**
     * True if BeginFrames are needed, false otherwise.
     */
    public Boolean isNeedsBeginFrames() {
        return needsBeginFrames;
    }

    /**
     * True if BeginFrames are needed, false otherwise.
     */
    public void setNeedsBeginFrames(Boolean needsBeginFrames) {
        this.needsBeginFrames = needsBeginFrames;
    }
}
