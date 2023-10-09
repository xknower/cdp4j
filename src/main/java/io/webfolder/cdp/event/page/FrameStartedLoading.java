package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when frame has started loading
 */
@Experimental
@Domain("Page")
@EventName("frameStartedLoading")
public class FrameStartedLoading {
    private String frameId;

    /**
     * Id of the frame that has started loading.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame that has started loading.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }
}
