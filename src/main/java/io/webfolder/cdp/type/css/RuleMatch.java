package io.webfolder.cdp.type.css;

import java.util.ArrayList;
import java.util.List;

/**
 * Match data for a CSS rule
 */
public class RuleMatch {
    private CSSRule rule;

    private List<Integer> matchingSelectors = new ArrayList<>();

    /**
     * CSS rule in the match.
     */
    public CSSRule getRule() {
        return rule;
    }

    /**
     * CSS rule in the match.
     */
    public void setRule(CSSRule rule) {
        this.rule = rule;
    }

    /**
     * Matching selector indices in the rule's selectorList selectors (0-based).
     */
    public List<Integer> getMatchingSelectors() {
        return matchingSelectors;
    }

    /**
     * Matching selector indices in the rule's selectorList selectors (0-based).
     */
    public void setMatchingSelectors(List<Integer> matchingSelectors) {
        this.matchingSelectors = matchingSelectors;
    }
}
