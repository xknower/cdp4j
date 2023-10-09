package io.webfolder.cdp.event.animation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Event for each animation that has been created
 */
@Domain("Animation")
@EventName("animationCreated")
public class AnimationCreated {
    private String id;

    /**
     * Id of the animation that was created.
     */
    public String getId() {
        return id;
    }

    /**
     * Id of the animation that was created.
     */
    public void setId(String id) {
        this.id = id;
    }
}
