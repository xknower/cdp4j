package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Browser window bounds information
 */
@Experimental
public class Bounds {
    private Integer left;

    private Integer top;

    private Integer width;

    private Integer height;

    private WindowState windowState;

    /**
     * The offset from the left edge of the screen to the window in pixels.
     */
    public Integer getLeft() {
        return left;
    }

    /**
     * The offset from the left edge of the screen to the window in pixels.
     */
    public void setLeft(Integer left) {
        this.left = left;
    }

    /**
     * The offset from the top edge of the screen to the window in pixels.
     */
    public Integer getTop() {
        return top;
    }

    /**
     * The offset from the top edge of the screen to the window in pixels.
     */
    public void setTop(Integer top) {
        this.top = top;
    }

    /**
     * The window width in pixels.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * The window width in pixels.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * The window height in pixels.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * The window height in pixels.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The window state. Default to normal.
     */
    public WindowState getWindowState() {
        return windowState;
    }

    /**
     * The window state. Default to normal.
     */
    public void setWindowState(WindowState windowState) {
        this.windowState = windowState;
    }
}
