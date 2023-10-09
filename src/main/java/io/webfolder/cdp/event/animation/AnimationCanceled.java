package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Event for when an animation has been cancelled
 */
@Domain("Animation")
@EventName("animationCanceled")
public class AnimationCanceled {
    private String id;

    /**
     * Id of the animation that was cancelled.
     */
    public String getId() {
        return id;
    }

    /**
     * Id of the animation that was cancelled.
     */
    public void setId(String id) {
        this.id = id;
    }
}
