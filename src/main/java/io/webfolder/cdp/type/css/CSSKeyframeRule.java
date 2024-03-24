package io.webfolder.cdp.type.css;

import lombok.Data;

/**
 * CSS keyframe rule representation
 */
@Data
public class CSSKeyframeRule {

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    private String styleSheetId;
    /**
     * Parent stylesheet's origin.
     */
    private StyleSheetOrigin origin;
    /**
     * Associated key text.
     */
    private Value keyText;
    /**
     * Associated style declaration.
     */
    private CSSStyle style;

}
