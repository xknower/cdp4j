package io.webfolder.cdp.type.css;

import java.util.List;

public class GetMatchedStylesForNodeResult {
    private CSSStyle inlineStyle;

    private CSSStyle attributesStyle;

    private List<RuleMatch> matchedCSSRules;

    private List<PseudoElementMatches> pseudoElements;

    private List<InheritedStyleEntry> inherited;

    private List<CSSKeyframesRule> cssKeyframesRules;

    public CSSStyle getInlineStyle() {
        return inlineStyle;
    }

    public CSSStyle getAttributesStyle() {
        return attributesStyle;
    }

    public List<RuleMatch> getMatchedCSSRules() {
        return matchedCSSRules;
    }

    public List<PseudoElementMatches> getPseudoElements() {
        return pseudoElements;
    }

    public List<InheritedStyleEntry> getInherited() {
        return inherited;
    }

    public List<CSSKeyframesRule> getCssKeyframesRules() {
        return cssKeyframesRules;
    }
}
