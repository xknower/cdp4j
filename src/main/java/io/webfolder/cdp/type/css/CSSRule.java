package io.webfolder.cdp.type.css;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS rule representation
 */
public class CSSRule {
    private String styleSheetId;

    private SelectorList selectorList;

    private StyleSheetOrigin origin;

    private CSSStyle style;

    private List<CSSMedia> media = new ArrayList<>();

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
     * Rule selector data.
     */
    public SelectorList getSelectorList() {
        return selectorList;
    }

    /**
     * Rule selector data.
     */
    public void setSelectorList(SelectorList selectorList) {
        this.selectorList = selectorList;
    }

    /**
     * Parent stylesheet's origin.
     */
    public StyleSheetOrigin getOrigin() {
        return origin;
    }

    /**
     * Parent stylesheet's origin.
     */
    public void setOrigin(StyleSheetOrigin origin) {
        this.origin = origin;
    }

    /**
     * Associated style declaration.
     */
    public CSSStyle getStyle() {
        return style;
    }

    /**
     * Associated style declaration.
     */
    public void setStyle(CSSStyle style) {
        this.style = style;
    }

    /**
     * Media list array (for rules involving media queries). The array enumerates media queries
     * starting with the innermost one, going outwards.
     */
    public List<CSSMedia> getMedia() {
        return media;
    }

    /**
     * Media list array (for rules involving media queries). The array enumerates media queries
     * starting with the innermost one, going outwards.
     */
    public void setMedia(List<CSSMedia> media) {
        this.media = media;
    }
}
