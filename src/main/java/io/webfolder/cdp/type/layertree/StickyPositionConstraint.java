package io.webfolder.cdp.type.layertree;

import io.webfolder.cdp.type.dom.Rect;
import lombok.Data;

/**
 * Sticky position constraints
 */
@Data
public class StickyPositionConstraint {

    /**
     * Layout rectangle of the sticky element before being shifted
     */
    private Rect stickyBoxRect;
    /**
     * Layout rectangle of the containing block of the sticky element
     */
    private Rect containingBlockRect;
    /**
     * The nearest sticky layer that shifts the sticky box
     */
    private String nearestLayerShiftingStickyBox;
    /**
     * The nearest sticky layer that shifts the containing block
     */
    private String nearestLayerShiftingContainingBlock;

}
