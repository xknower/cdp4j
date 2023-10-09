package io.webfolder.cdp.event.overlay;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.page.Viewport;

/**
 * Fired when user asks to capture screenshot of some area on the page
 */
@Domain("Overlay")
@EventName("screenshotRequested")
public class ScreenshotRequested {
    private Viewport viewport;

    /**
     * Viewport to capture, in CSS.
     */
    public Viewport getViewport() {
        return viewport;
    }

    /**
     * Viewport to capture, in CSS.
     */
    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }
}
