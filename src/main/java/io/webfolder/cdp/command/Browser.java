package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.browser.Bounds;
import io.webfolder.cdp.type.browser.GetVersionResult;
import io.webfolder.cdp.type.browser.GetWindowForTargetResult;
import io.webfolder.cdp.type.browser.Histogram;
import io.webfolder.cdp.type.browser.PermissionType;

import java.util.List;

/**
 * The Browser domain defines methods and events for browser managing
 */
@Domain("Browser")
public interface Browser {
    /**
     * Grant specific permissions to the given origin and reject all others.
     *
     * @param browserContextId BrowserContext to override permissions. When omitted, default browser context is used.
     */
    @Experimental
    void grantPermissions(String origin, PermissionType permissions,
                          @Optional String browserContextId);

    /**
     * Reset all permission management for all origins.
     *
     * @param browserContextId BrowserContext to reset permissions. When omitted, default browser context is used.
     */
    @Experimental
    void resetPermissions(@Optional String browserContextId);

    /**
     * Close browser gracefully.
     */
    void close();

    /**
     * Crashes browser on the main thread.
     */
    @Experimental
    void crash();

    /**
     * Returns version information.
     *
     * @return GetVersionResult
     */
    GetVersionResult getVersion();

    /**
     * Returns the command line switches for the browser process if, and only if
     * --enable-automation is on the commandline.
     *
     * @return Commandline parameters
     */
    @Experimental
    @Returns("arguments")
    List<String> getBrowserCommandLine();

    /**
     * Get Chrome histograms.
     *
     * @param query Requested substring in name. Only histograms which have query as a
     *              substring in their name are extracted. An empty or absent query returns
     *              all histograms.
     * @param delta If true, retrieve delta since last call.
     * @return Histograms.
     */
    @Experimental
    @Returns("histograms")
    List<Histogram> getHistograms(@Optional String query, @Optional Boolean delta);

    /**
     * Get a Chrome histogram by name.
     *
     * @param name  Requested histogram name.
     * @param delta If true, retrieve delta since last call.
     * @return Histogram.
     */
    @Experimental
    @Returns("histogram")
    Histogram getHistogram(String name, @Optional Boolean delta);

    /**
     * Get position and size of the browser window.
     *
     * @param windowId Browser window id.
     * @return Bounds information of the window. When window state is 'minimized', the restored window
     * position and size are returned.
     */
    @Experimental
    @Returns("bounds")
    Bounds getWindowBounds(Integer windowId);

    /**
     * Get the browser window that contains the devtools target.
     *
     * @param targetId Devtools agent host id. If called as a part of the session, associated targetId is used.
     * @return GetWindowForTargetResult
     */
    @Experimental
    GetWindowForTargetResult getWindowForTarget(@Optional String targetId);

    /**
     * Set position and/or size of the browser window.
     *
     * @param windowId Browser window id.
     * @param bounds   New window bounds. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
     *                 with 'left', 'top', 'width' or 'height'. Leaves unspecified fields unchanged.
     */
    @Experimental
    void setWindowBounds(Integer windowId, Bounds bounds);

    /**
     * Set dock tile details, platform-specific.
     *
     * @param image Png encoded image.
     */
    @Experimental
    void setDockTile(@Optional String badgeLabel, @Optional String image);

    /**
     * Grant specific permissions to the given origin and reject all others.
     */
    @Experimental
    void grantPermissions(String origin, PermissionType permissions);

    /**
     * Reset all permission management for all origins.
     */
    @Experimental
    void resetPermissions();

    /**
     * Get Chrome histograms.
     *
     * @return Histograms.
     */
    @Experimental
    @Returns("histograms")
    List<Histogram> getHistograms();

    /**
     * Get a Chrome histogram by name.
     *
     * @param name Requested histogram name.
     * @return Histogram.
     */
    @Experimental
    @Returns("histogram")
    Histogram getHistogram(String name);

    /**
     * Get the browser window that contains the devtools target.
     *
     * @return GetWindowForTargetResult
     */
    @Experimental
    GetWindowForTargetResult getWindowForTarget();

    /**
     * Set dock tile details, platform-specific.
     */
    @Experimental
    void setDockTile();
}
