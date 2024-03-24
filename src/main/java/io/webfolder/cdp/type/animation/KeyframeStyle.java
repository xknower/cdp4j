package io.webfolder.cdp.type.animation;

import lombok.Data;

/**
 * Keyframe Style
 */
@Data
public class KeyframeStyle {

    /**
     * Keyframe's time offset.
     */
    private String offset;
    /**
     * <code>AnimationEffect</code>'s timing function.
     */
    private String easing;

}
