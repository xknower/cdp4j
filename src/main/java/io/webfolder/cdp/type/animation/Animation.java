package io.webfolder.cdp.type.animation;

import io.webfolder.cdp.type.constant.AnimationType;
import lombok.Data;

/**
 * Animation instance
 */
@Data
public class Animation {

    /**
     * <code>Animation</code>'s id.
     */
    private String id;
    /**
     * <code>Animation</code>'s name.
     */
    private String name;
    /**
     * <code>Animation</code>'s internal paused state.
     */
    private Boolean pausedState;
    /**
     * <code>Animation</code>'s play state.
     */
    private String playState;
    /**
     * <code>Animation</code>'s playback rate.
     */
    private Double playbackRate;
    /**
     * <code>Animation</code>'s start time.
     */
    private Double startTime;
    /**
     * <code>Animation</code>'s current time.
     */
    private Double currentTime;
    /**
     * Animation type of <code>Animation</code>.
     */
    private AnimationType type;
    /**
     * <code>Animation</code>'s source animation node.
     */
    private AnimationEffect source;
    /**
     * A unique ID for <code>Animation</code> representing the sources that triggered this CSS
     * animation/transition.
     */
    private String cssId;

}
