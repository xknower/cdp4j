package io.webfolder.cdp.event.profiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.debugger.Location;
import io.webfolder.cdp.type.profiler.Profile;
import lombok.Data;

@Domain("Profiler")
@EventName("consoleProfileFinished")
@Data
public class ConsoleProfileFinished {

    private String id;
    /**
     * Location of console.profileEnd().
     */
    private Location location;

    private Profile profile;
    /**
     * Profile title passed as an argument to console.profile().
     */
    private String title;

}
