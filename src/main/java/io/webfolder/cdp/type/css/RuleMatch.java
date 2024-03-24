package io.webfolder.cdp.type.css;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Match data for a CSS rule
 */
@Data
public class RuleMatch {

    /**
     * CSS rule in the match.
     */
    private CSSRule rule;
    /**
     * Matching selector indices in the rule's selectorList selectors (0-based).
     */
    private List<Integer> matchingSelectors = new ArrayList<>();

}
