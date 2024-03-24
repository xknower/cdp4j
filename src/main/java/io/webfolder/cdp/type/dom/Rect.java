package io.webfolder.cdp.type.dom;

import lombok.Data;

/**
 * Rectangle
 */
@Data
public class Rect {

    /**
     * X coordinate
     */
    private Double x;
    /**
     * Y coordinate
     */
    private Double y;
    /**
     * Rectangle width
     */
    private Double width;
    /**
     * Rectangle height
     */
    private Double height;

}
