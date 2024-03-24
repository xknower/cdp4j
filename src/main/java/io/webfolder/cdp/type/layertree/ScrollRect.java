package io.webfolder.cdp.type.layertree;

import io.webfolder.cdp.type.constant.RepaintReason;
import io.webfolder.cdp.type.dom.Rect;
import lombok.Data;

/**
 * Rectangle where scrolling happens on the main thread
 */
@Data
public class ScrollRect {

    /**
     * Rectangle itself.
     */
    private Rect rect;
    /**
     * Reason for rectangle to force scrolling on the main thread
     */
    private RepaintReason type;

}
