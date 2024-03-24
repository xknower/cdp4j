package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Fired when frame no longer has a scheduled navigation
 */
@Experimental
@Domain("Page")
@EventName("frameClearedScheduledNavigation")
@Data
public class FrameClearedScheduledNavigation {

    /**
     * Id of the frame that has cleared its scheduled navigation.
     */
    private String frameId;

}
