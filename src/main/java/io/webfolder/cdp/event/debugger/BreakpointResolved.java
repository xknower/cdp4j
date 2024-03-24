package io.webfolder.cdp.event.debugger;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.debugger.Location;
import lombok.Data;

/**
 * Fired when breakpoint is resolved to an actual script and location
 */
@Domain("Debugger")
@EventName("breakpointResolved")
@Data
public class BreakpointResolved {

    /**
     * Breakpoint unique identifier.
     */
    private String breakpointId;
    /**
     * Actual breakpoint location.
     */
    private Location location;

}
