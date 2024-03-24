package io.webfolder.cdp.type.animation;

import lombok.Data;

/**
 * AnimationEffect instance
 */
@Data
public class AnimationEffect {

    /**
     * <code>AnimationEffect</code>'s delay.
     */
    private Double delay;
    /**
     * <code>AnimationEffect</code>'s end delay.
     */
    private Double endDelay;
    /**
     * <code>AnimationEffect</code>'s iteration start.
     */
    private Double iterationStart;
    /**
     * <code>AnimationEffect</code>'s iterations.
     */
    private Double iterations;
    /**
     * <code>AnimationEffect</code>'s iteration duration.
     */
    private Double duration;
    /**
     * <code>AnimationEffect</code>'s playback direction.
     */
    private String direction;
    /**
     * <code>AnimationEffect</code>'s fill mode.
     */
    private String fill;
    /**
     * <code>AnimationEffect</code>'s target node.
     */
    private Integer backendNodeId;
    /**
     * <code>AnimationEffect</code>'s keyframes.
     */
    private KeyframesRule keyframesRule;
    /**
     * <code>AnimationEffect</code>'s timing function.
     */
    private String easing;

}
