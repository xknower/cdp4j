package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Screencast frame metadata
 */
@Experimental
public class ScreencastFrameMetadata {
    private Double offsetTop;

    private Double pageScaleFactor;

    private Double deviceWidth;

    private Double deviceHeight;

    private Double scrollOffsetX;

    private Double scrollOffsetY;

    private Double timestamp;

    /**
     * Top offset in DIP.
     */
    public Double getOffsetTop() {
        return offsetTop;
    }

    /**
     * Top offset in DIP.
     */
    public void setOffsetTop(Double offsetTop) {
        this.offsetTop = offsetTop;
    }

    /**
     * Page scale factor.
     */
    public Double getPageScaleFactor() {
        return pageScaleFactor;
    }

    /**
     * Page scale factor.
     */
    public void setPageScaleFactor(Double pageScaleFactor) {
        this.pageScaleFactor = pageScaleFactor;
    }

    /**
     * Device screen width in DIP.
     */
    public Double getDeviceWidth() {
        return deviceWidth;
    }

    /**
     * Device screen width in DIP.
     */
    public void setDeviceWidth(Double deviceWidth) {
        this.deviceWidth = deviceWidth;
    }

    /**
     * Device screen height in DIP.
     */
    public Double getDeviceHeight() {
        return deviceHeight;
    }

    /**
     * Device screen height in DIP.
     */
    public void setDeviceHeight(Double deviceHeight) {
        this.deviceHeight = deviceHeight;
    }

    /**
     * Position of horizontal scroll in CSS pixels.
     */
    public Double getScrollOffsetX() {
        return scrollOffsetX;
    }

    /**
     * Position of horizontal scroll in CSS pixels.
     */
    public void setScrollOffsetX(Double scrollOffsetX) {
        this.scrollOffsetX = scrollOffsetX;
    }

    /**
     * Position of vertical scroll in CSS pixels.
     */
    public Double getScrollOffsetY() {
        return scrollOffsetY;
    }

    /**
     * Position of vertical scroll in CSS pixels.
     */
    public void setScrollOffsetY(Double scrollOffsetY) {
        this.scrollOffsetY = scrollOffsetY;
    }

    /**
     * Frame swap timestamp.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Frame swap timestamp.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }
}
