package io.webfolder.cdp.event.debugger;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.debugger.Location;

/**
 * Fired when breakpoint is resolved to an actual script and location
 */
@Domain("Debugger")
@EventName("breakpointResolved")
public class BreakpointResolved {
    private String breakpointId;

    private Location location;

    /**
     * Breakpoint unique identifier.
     */
    public String getBreakpointId() {
        return breakpointId;
    }

    /**
     * Breakpoint unique identifier.
     */
    public void setBreakpointId(String breakpointId) {
        this.breakpointId = breakpointId;
    }

    /**
     * Actual breakpoint location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Actual breakpoint location.
     */
    public void setLocation(Location location) {
        this.location = location;
    }
}
