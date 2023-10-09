package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when frame no longer has a scheduled navigation
 */
@Experimental
@Domain("Page")
@EventName("frameClearedScheduledNavigation")
public class FrameClearedScheduledNavigation {
    private String frameId;

    /**
     * Id of the frame that has cleared its scheduled navigation.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame that has cleared its scheduled navigation.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }
}
