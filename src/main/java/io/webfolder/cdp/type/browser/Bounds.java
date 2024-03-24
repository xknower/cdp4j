package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Browser window bounds information
 */
@Experimental
@Data
public class Bounds {

    /**
     * The offset from the left edge of the screen to the window in pixels.
     */
    private Integer left;
    /**
     * The offset from the top edge of the screen to the window in pixels.
     */
    private Integer top;
    /**
     * The window width in pixels.
     */
    private Integer width;
    /**
     * The window height in pixels.
     */
    private Integer height;
    /**
     * The window state. Default to normal.
     */
    private WindowState windowState;

}
