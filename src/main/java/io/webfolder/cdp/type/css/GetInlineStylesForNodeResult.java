package io.webfolder.cdp.type.css;

import lombok.Getter;

@Getter
public class GetInlineStylesForNodeResult {

    private CSSStyle inlineStyle;

    private CSSStyle attributesStyle;

}
