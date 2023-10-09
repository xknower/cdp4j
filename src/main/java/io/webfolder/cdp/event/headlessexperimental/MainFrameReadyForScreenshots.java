package io.webfolder.cdp.event.headlessexperimental;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Issued when the main frame has first submitted a frame to the browser
 * May only be fired while a
 * BeginFrame is in flight
 * Before this event, screenshotting requests may fail
 */
@Domain("HeadlessExperimental")
@EventName("mainFrameReadyForScreenshots")
public class MainFrameReadyForScreenshots {
}
