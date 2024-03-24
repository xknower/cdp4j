package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.animation.Animation;
import lombok.Data;

/**
 * Event for animation that has been started
 */
@Domain("Animation")
@EventName("animationStarted")
@Data
public class AnimationStarted {

    /**
     * Animation that was started.
     */
    private Animation animation;

}
