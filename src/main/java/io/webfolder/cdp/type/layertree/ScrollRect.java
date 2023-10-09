package io.webfolder.cdp.type.layertree;

import io.webfolder.cdp.type.constant.RepaintReason;
import io.webfolder.cdp.type.dom.Rect;

/**
 * Rectangle where scrolling happens on the main thread
 */
public class ScrollRect {
    private Rect rect;

    private RepaintReason type;

    /**
     * Rectangle itself.
     */
    public Rect getRect() {
        return rect;
    }

    /**
     * Rectangle itself.
     */
    public void setRect(Rect rect) {
        this.rect = rect;
    }

    /**
     * Reason for rectangle to force scrolling on the main thread
     */
    public RepaintReason getType() {
        return type;
    }

    /**
     * Reason for rectangle to force scrolling on the main thread
     */
    public void setType(RepaintReason type) {
        this.type = type;
    }
}
