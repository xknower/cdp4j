package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when frame has been detached from its parent
 */
@Domain("Page")
@EventName("frameDetached")
@Data
public class FrameDetached {

    /**
     * Id of the frame that has been detached.
     */
    private String frameId;

}
