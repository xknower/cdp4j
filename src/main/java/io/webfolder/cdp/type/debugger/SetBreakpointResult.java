package io.webfolder.cdp.type.debugger;

public class SetBreakpointResult {
    private String breakpointId;

    private Location actualLocation;

    public String getBreakpointId() {
        return breakpointId;
    }

    public Location getActualLocation() {
        return actualLocation;
    }
}
