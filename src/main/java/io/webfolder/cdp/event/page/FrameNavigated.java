package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.page.Frame;
import lombok.Data;

/**
 * Fired once navigation of the frame has completed
 * Frame is now associated with the new loader
 */
@Domain("Page")
@EventName("frameNavigated")
@Data
public class FrameNavigated {

    /**
     * Frame object.
     */
    private Frame frame;

}
