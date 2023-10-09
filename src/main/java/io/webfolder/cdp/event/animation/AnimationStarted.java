package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.animation.Animation;

/**
 * Event for animation that has been started
 */
@Domain("Animation")
@EventName("animationStarted")
public class AnimationStarted {
    private Animation animation;

    /**
     * Animation that was started.
     */
    public Animation getAnimation() {
        return animation;
    }

    /**
     * Animation that was started.
     */
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
