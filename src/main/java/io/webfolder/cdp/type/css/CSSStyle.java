package io.webfolder.cdp.type.css;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS style representation
 */
public class CSSStyle {
    private String styleSheetId;

    private List<CSSProperty> cssProperties = new ArrayList<>();

    private List<ShorthandEntry> shorthandEntries = new ArrayList<>();

    private String cssText;

    private SourceRange range;

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
     * CSS properties in the style.
     */
    public List<CSSProperty> getCssProperties() {
        return cssProperties;
    }

    /**
     * CSS properties in the style.
     */
    public void setCssProperties(List<CSSProperty> cssProperties) {
        this.cssProperties = cssProperties;
    }

    /**
     * Computed values for all shorthands found in the style.
     */
    public List<ShorthandEntry> getShorthandEntries() {
        return shorthandEntries;
    }

    /**
     * Computed values for all shorthands found in the style.
     */
    public void setShorthandEntries(List<ShorthandEntry> shorthandEntries) {
        this.shorthandEntries = shorthandEntries;
    }

    /**
     * Style declaration text (if available).
     */
    public String getCssText() {
        return cssText;
    }

    /**
     * Style declaration text (if available).
     */
    public void setCssText(String cssText) {
        this.cssText = cssText;
    }

    /**
     * Style declaration range in the enclosing stylesheet (if available).
     */
    public SourceRange getRange() {
        return range;
    }

    /**
     * Style declaration range in the enclosing stylesheet (if available).
     */
    public void setRange(SourceRange range) {
        this.range = range;
    }
}
