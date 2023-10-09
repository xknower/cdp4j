package io.webfolder.cdp.type.animation;

import java.util.ArrayList;
import java.util.List;

/**
 * Keyframes Rule
 */
public class KeyframesRule {
    private String name;

    private List<KeyframeStyle> keyframes = new ArrayList<>();

    /**
     * CSS keyframed animation's name.
     */
    public String getName() {
        return name;
    }

    /**
     * CSS keyframed animation's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of animation keyframes.
     */
    public List<KeyframeStyle> getKeyframes() {
        return keyframes;
    }

    /**
     * List of animation keyframes.
     */
    public void setKeyframes(List<KeyframeStyle> keyframes) {
        this.keyframes = keyframes;
    }
}
