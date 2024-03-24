package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Fired when the page with currently enabled screencast was shown or hidden
 */
@Experimental
@Domain("Page")
@EventName("screencastVisibilityChanged")
@Data
public class ScreencastVisibilityChanged {

    /**
     * True if the page is visible.
     */
    private Boolean visible;

}
