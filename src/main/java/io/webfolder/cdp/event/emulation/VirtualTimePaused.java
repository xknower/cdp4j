package io.webfolder.cdp.event.emulation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Notification sent after the virtual time has paused
 */
@Experimental
@Domain("Emulation")
@EventName("virtualTimePaused")
@Data
public class VirtualTimePaused {

    /**
     * The amount of virtual time that has elapsed in milliseconds since virtual time was first
     * enabled.
     */
    private Double virtualTimeElapsed;

}
