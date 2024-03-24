package io.webfolder.cdp.event.overlay;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.page.Viewport;
import lombok.Data;

/**
 * Fired when user asks to capture screenshot of some area on the page
 */
@Domain("Overlay")
@EventName("screenshotRequested")
@Data
public class ScreenshotRequested {

    /**
     * Viewport to capture, in CSS.
     */
    private Viewport viewport;

}
