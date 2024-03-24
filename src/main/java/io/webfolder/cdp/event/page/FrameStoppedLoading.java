package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Fired when frame has stopped loading
 */
@Experimental
@Domain("Page")
@EventName("frameStoppedLoading")
@Data
public class FrameStoppedLoading {

    /**
     * Id of the frame that has stopped loading.
     */
    private String frameId;

}
