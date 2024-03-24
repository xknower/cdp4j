package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.FrameNavigationReason;
import lombok.Data;

/**
 * Fired when frame schedules a potential navigation
 */
@Experimental
@Domain("Page")
@EventName("frameScheduledNavigation")
@Data
public class FrameScheduledNavigation {

    /**
     * Id of the frame that has scheduled a navigation.
     */
    private String frameId;
    /**
     * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not
     * guaranteed to start.
     */
    private Double delay;
    /**
     * The reason for the navigation.
     */
    private FrameNavigationReason reason;
    /**
     * The destination URL for the scheduled navigation.
     */
    private String url;

}
