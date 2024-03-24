package io.webfolder.cdp.type.css;

import lombok.Getter;

import java.util.List;

@Getter
public class GetMatchedStylesForNodeResult {

    private CSSStyle inlineStyle;

    private CSSStyle attributesStyle;

    private List<RuleMatch> matchedCSSRules;

    private List<PseudoElementMatches> pseudoElements;

    private List<InheritedStyleEntry> inherited;

    private List<CSSKeyframesRule> cssKeyframesRules;

}
