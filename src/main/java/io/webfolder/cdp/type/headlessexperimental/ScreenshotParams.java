package io.webfolder.cdp.type.headlessexperimental;

import io.webfolder.cdp.type.constant.ImageFormat;

/**
 * Encoding options for a screenshot
 */
public class ScreenshotParams {
    private ImageFormat format;

    private Integer quality;

    /**
     * Image compression format (defaults to png).
     */
    public ImageFormat getFormat() {
        return format;
    }

    /**
     * Image compression format (defaults to png).
     */
    public void setFormat(ImageFormat format) {
        this.format = format;
    }

    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
