package io.webfolder.cdp.type.debugger;

import lombok.Getter;

@Getter
public class SetBreakpointResult {

    private String breakpointId;

    private Location actualLocation;

}
