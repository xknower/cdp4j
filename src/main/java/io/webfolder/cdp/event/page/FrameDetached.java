package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when frame has been detached from its parent
 */
@Domain("Page")
@EventName("frameDetached")
public class FrameDetached {
    private String frameId;

    /**
     * Id of the frame that has been detached.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame that has been detached.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }
}
