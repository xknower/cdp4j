package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Fired when frame has started loading
 */
@Experimental
@Domain("Page")
@EventName("frameStartedLoading")
@Data
public class FrameStartedLoading {

    /**
     * Id of the frame that has started loading.
     */
    private String frameId;

}
