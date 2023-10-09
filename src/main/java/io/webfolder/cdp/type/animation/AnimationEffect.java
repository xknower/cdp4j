package io.webfolder.cdp.type.animation;

/**
 * AnimationEffect instance
 */
public class AnimationEffect {
    private Double delay;

    private Double endDelay;

    private Double iterationStart;

    private Double iterations;

    private Double duration;

    private String direction;

    private String fill;

    private Integer backendNodeId;

    private KeyframesRule keyframesRule;

    private String easing;

    /**
     * <code>AnimationEffect</code>'s delay.
     */
    public Double getDelay() {
        return delay;
    }

    /**
     * <code>AnimationEffect</code>'s delay.
     */
    public void setDelay(Double delay) {
        this.delay = delay;
    }

    /**
     * <code>AnimationEffect</code>'s end delay.
     */
    public Double getEndDelay() {
        return endDelay;
    }

    /**
     * <code>AnimationEffect</code>'s end delay.
     */
    public void setEndDelay(Double endDelay) {
        this.endDelay = endDelay;
    }

    /**
     * <code>AnimationEffect</code>'s iteration start.
     */
    public Double getIterationStart() {
        return iterationStart;
    }

    /**
     * <code>AnimationEffect</code>'s iteration start.
     */
    public void setIterationStart(Double iterationStart) {
        this.iterationStart = iterationStart;
    }

    /**
     * <code>AnimationEffect</code>'s iterations.
     */
    public Double getIterations() {
        return iterations;
    }

    /**
     * <code>AnimationEffect</code>'s iterations.
     */
    public void setIterations(Double iterations) {
        this.iterations = iterations;
    }

    /**
     * <code>AnimationEffect</code>'s iteration duration.
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * <code>AnimationEffect</code>'s iteration duration.
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * <code>AnimationEffect</code>'s playback direction.
     */
    public String getDirection() {
        return direction;
    }

    /**
     * <code>AnimationEffect</code>'s playback direction.
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <code>AnimationEffect</code>'s fill mode.
     */
    public String getFill() {
        return fill;
    }

    /**
     * <code>AnimationEffect</code>'s fill mode.
     */
    public void setFill(String fill) {
        this.fill = fill;
    }

    /**
     * <code>AnimationEffect</code>'s target node.
     */
    public Integer getBackendNodeId() {
        return backendNodeId;
    }

    /**
     * <code>AnimationEffect</code>'s target node.
     */
    public void setBackendNodeId(Integer backendNodeId) {
        this.backendNodeId = backendNodeId;
    }

    /**
     * <code>AnimationEffect</code>'s keyframes.
     */
    public KeyframesRule getKeyframesRule() {
        return keyframesRule;
    }

    /**
     * <code>AnimationEffect</code>'s keyframes.
     */
    public void setKeyframesRule(KeyframesRule keyframesRule) {
        this.keyframesRule = keyframesRule;
    }

    /**
     * <code>AnimationEffect</code>'s timing function.
     */
    public String getEasing() {
        return easing;
    }

    /**
     * <code>AnimationEffect</code>'s timing function.
     */
    public void setEasing(String easing) {
        this.easing = easing;
    }
}
