package io.webfolder.cdp.type.css;

/**
 * CSS keyframe rule representation
 */
public class CSSKeyframeRule {
    private String styleSheetId;

    private StyleSheetOrigin origin;

    private Value keyText;

    private CSSStyle style;

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
     * Associated key text.
     */
    public Value getKeyText() {
        return keyText;
    }

    /**
     * Associated key text.
     */
    public void setKeyText(Value keyText) {
        this.keyText = keyText;
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
}
