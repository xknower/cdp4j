package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Event for when an animation has been cancelled
 */
@Domain("Animation")
@EventName("animationCanceled")
@Data
public class AnimationCanceled {

    /**
     * Id of the animation that was cancelled.
     */
    private String id;

}
