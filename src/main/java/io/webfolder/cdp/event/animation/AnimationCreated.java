package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Event for each animation that has been created
 */
@Domain("Animation")
@EventName("animationCreated")
@Data
public class AnimationCreated {

    /**
     * Id of the animation that was created.
     */
    private String id;

}
