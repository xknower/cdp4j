package io.webfolder.cdp.event.emulation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Notification sent after the virtual time has paused
 */
@Experimental
@Domain("Emulation")
@EventName("virtualTimePaused")
public class VirtualTimePaused {
    private Double virtualTimeElapsed;

    /**
     * The amount of virtual time that has elapsed in milliseconds since virtual time was first
     * enabled.
     */
    public Double getVirtualTimeElapsed() {
        return virtualTimeElapsed;
    }

    /**
     * The amount of virtual time that has elapsed in milliseconds since virtual time was first
     * enabled.
     */
    public void setVirtualTimeElapsed(Double virtualTimeElapsed) {
        this.virtualTimeElapsed = virtualTimeElapsed;
    }
}
