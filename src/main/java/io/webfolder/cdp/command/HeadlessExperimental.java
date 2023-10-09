package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.type.headlessexperimental.BeginFrameResult;
import io.webfolder.cdp.type.headlessexperimental.ScreenshotParams;

/**
 * This domain provides experimental commands only supported in headless mode
 */
@Experimental
@Domain("HeadlessExperimental")
public interface HeadlessExperimental {
    /**
     * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
     * screenshot from the resulting frame. Requires that the target was created with enabled
     * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
     * https://goo.gl/3zHXhB for more background.
     *
     * @param frameTimeTicks   Timestamp of this BeginFrame in Renderer TimeTicks (milliseconds of uptime). If not set,
     *                         the current time will be used.
     * @param interval         The interval between BeginFrames that is reported to the compositor, in milliseconds.
     *                         Defaults to a 60 frames/second interval, i.e. about 16.666 milliseconds.
     * @param noDisplayUpdates Whether updates should not be committed and drawn onto the display. False by default. If
     *                         true, only side effects of the BeginFrame will be run, such as layout and animations, but
     *                         any visual updates may not be visible on the display or in screenshots.
     * @param screenshot       If set, a screenshot of the frame will be captured and returned in the response. Otherwise,
     *                         no screenshot will be captured. Note that capturing a screenshot can fail, for example,
     *                         during renderer initialization. In such a case, no screenshot data will be returned.
     * @return BeginFrameResult
     */
    BeginFrameResult beginFrame(@Optional Double frameTimeTicks, @Optional Double interval,
                                @Optional Boolean noDisplayUpdates, @Optional ScreenshotParams screenshot);

    /**
     * Disables headless events for the target.
     */
    void disable();

    /**
     * Enables headless events for the target.
     */
    void enable();

    /**
     * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
     * screenshot from the resulting frame. Requires that the target was created with enabled
     * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
     * https://goo.gl/3zHXhB for more background.
     *
     * @return BeginFrameResult
     */
    BeginFrameResult beginFrame();
}
