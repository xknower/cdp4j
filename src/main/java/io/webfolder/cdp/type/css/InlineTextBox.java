package io.webfolder.cdp.type.css;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.Rect;
import lombok.Data;

/**
 * Details of post layout rendered text positions
 * The exact layout should not be regarded as stable and may change between versions
 */
@Experimental
@Data
public class InlineTextBox {

    /**
     * The absolute position bounding box.
     */
    private Rect boundingBox;
    /**
     * The starting index in characters, for this post layout textbox substring.
     */
    private Integer startCharacterIndex;
    /**
     * The number of characters in this post layout textbox substring.
     */
    private Integer numCharacters;

}
