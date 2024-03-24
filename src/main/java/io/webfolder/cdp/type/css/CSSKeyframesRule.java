package io.webfolder.cdp.type.css;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS keyframes rule representation
 */
@Data
public class CSSKeyframesRule {

    /**
     * Animation name.
     */
    private Value animationName;
    /**
     * List of keyframes.
     */
    private List<CSSKeyframeRule> keyframes = new ArrayList<>();

}
