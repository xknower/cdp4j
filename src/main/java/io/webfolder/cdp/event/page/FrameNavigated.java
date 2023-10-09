package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.page.Frame;

/**
 * Fired once navigation of the frame has completed
 * Frame is now associated with the new loader
 */
@Domain("Page")
@EventName("frameNavigated")
public class FrameNavigated {
    private Frame frame;

    /**
     * Frame object.
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Frame object.
     */
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
