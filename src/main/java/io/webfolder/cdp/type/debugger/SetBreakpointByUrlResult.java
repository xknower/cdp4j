package io.webfolder.cdp.type.debugger;

import java.util.List;

public class SetBreakpointByUrlResult {
    private String breakpointId;

    private List<Location> locations;

    public String getBreakpointId() {
        return breakpointId;
    }

    public List<Location> getLocations() {
        return locations;
    }
}
