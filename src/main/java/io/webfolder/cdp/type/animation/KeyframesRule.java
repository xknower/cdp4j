package io.webfolder.cdp.type.animation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Keyframes Rule
 */
@Data
public class KeyframesRule {

    /**
     * CSS keyframed animation's name.
     */
    private String name;
    /**
     * List of animation keyframes.
     */
    private List<KeyframeStyle> keyframes = new ArrayList<>();

}
