package io.webfolder.cdp.type.domsnapshot;

import io.webfolder.cdp.type.dom.Rect;

/**
 * Details of post layout rendered text positions
 * The exact layout should not be regarded as
 * stable and may change between versions
 */
public class InlineTextBox {
    private Rect boundingBox;

    private Integer startCharacterIndex;

    private Integer numCharacters;

    /**
     * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
     */
    public Rect getBoundingBox() {
        return boundingBox;
    }

    /**
     * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
     */
    public void setBoundingBox(Rect boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * The starting index in characters, for this post layout textbox substring. Characters that
     * would be represented as a surrogate pair in UTF-16 have length 2.
     */
    public Integer getStartCharacterIndex() {
        return startCharacterIndex;
    }

    /**
     * The starting index in characters, for this post layout textbox substring. Characters that
     * would be represented as a surrogate pair in UTF-16 have length 2.
     */
    public void setStartCharacterIndex(Integer startCharacterIndex) {
        this.startCharacterIndex = startCharacterIndex;
    }

    /**
     * The number of characters in this post layout textbox substring. Characters that would be
     * represented as a surrogate pair in UTF-16 have length 2.
     */
    public Integer getNumCharacters() {
        return numCharacters;
    }

    /**
     * The number of characters in this post layout textbox substring. Characters that would be
     * represented as a surrogate pair in UTF-16 have length 2.
     */
    public void setNumCharacters(Integer numCharacters) {
        this.numCharacters = numCharacters;
    }
}
