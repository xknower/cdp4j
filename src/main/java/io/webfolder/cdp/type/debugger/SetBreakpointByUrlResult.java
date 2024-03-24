package io.webfolder.cdp.type.debugger;

import lombok.Getter;

import java.util.List;

@Getter
public class SetBreakpointByUrlResult {

    private String breakpointId;

    private List<Location> locations;

}
