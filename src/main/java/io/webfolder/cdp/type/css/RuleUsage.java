package io.webfolder.cdp.type.css;

/**
 * CSS coverage information
 */
public class RuleUsage {
    private String styleSheetId;

    private Double startOffset;

    private Double endOffset;

    private Boolean used;

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public String getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public void setStyleSheetId(String styleSheetId) {
        this.styleSheetId = styleSheetId;
    }

    /**
     * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
     */
    public Double getStartOffset() {
        return startOffset;
    }

    /**
     * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
     */
    public void setStartOffset(Double startOffset) {
        this.startOffset = startOffset;
    }

    /**
     * Offset of the end of the rule body from the beginning of the stylesheet.
     */
    public Double getEndOffset() {
        return endOffset;
    }

    /**
     * Offset of the end of the rule body from the beginning of the stylesheet.
     */
    public void setEndOffset(Double endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * Indicates whether the rule was actually used by some element in the page.
     */
    public Boolean isUsed() {
        return used;
    }

    /**
     * Indicates whether the rule was actually used by some element in the page.
     */
    public void setUsed(Boolean used) {
        this.used = used;
    }
}
