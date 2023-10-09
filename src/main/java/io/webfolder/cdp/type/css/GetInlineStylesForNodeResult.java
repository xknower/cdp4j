package io.webfolder.cdp.type.css;

public class GetInlineStylesForNodeResult {
    private CSSStyle inlineStyle;

    private CSSStyle attributesStyle;

    public CSSStyle getInlineStyle() {
        return inlineStyle;
    }

    public CSSStyle getAttributesStyle() {
        return attributesStyle;
    }
}
