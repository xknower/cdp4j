package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when frame has stopped loading
 */
@Experimental
@Domain("Page")
@EventName("frameStoppedLoading")
public class FrameStoppedLoading {
    private String frameId;

    /**
     * Id of the frame that has stopped loading.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame that has stopped loading.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }
}
