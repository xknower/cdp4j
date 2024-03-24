package io.webfolder.cdp.type.css;

import io.webfolder.cdp.type.dom.PseudoType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS rule collection for a single pseudo style
 */
@Data
public class PseudoElementMatches {

    /**
     * Pseudo element type.
     */
    private PseudoType pseudoType;
    /**
     * Matches of CSS rules applicable to the pseudo style.
     */
    private List<RuleMatch> matches = new ArrayList<>();

}
