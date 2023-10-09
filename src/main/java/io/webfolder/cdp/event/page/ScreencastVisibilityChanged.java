package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when the page with currently enabled screencast was shown or hidden
 */
@Experimental
@Domain("Page")
@EventName("screencastVisibilityChanged")
public class ScreencastVisibilityChanged {
    private Boolean visible;

    /**
     * True if the page is visible.
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * True if the page is visible.
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
