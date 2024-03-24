package io.webfolder.cdp.type.headlessexperimental;

import io.webfolder.cdp.type.constant.ImageFormat;
import lombok.Data;

/**
 * Encoding options for a screenshot
 */
@Data
public class ScreenshotParams {

    /**
     * Image compression format (defaults to png).
     */
    private ImageFormat format;
    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    private Integer quality;

}
