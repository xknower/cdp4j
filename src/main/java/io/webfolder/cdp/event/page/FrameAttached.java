package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.StackTrace;
import lombok.Data;

/**
 * Fired when frame has been attached to its parent
 */
@Domain("Page")
@EventName("frameAttached")
@Data
public class FrameAttached {

    /**
     * Id of the frame that has been attached.
     */
    private String frameId;
    /**
     * Parent frame identifier.
     */
    private String parentFrameId;
    /**
     * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
     */
    private StackTrace stack;

}
