package io.webfolder.cdp.event.profiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.debugger.Location;
import lombok.Data;

/**
 * Sent when new profile recording is started using console
 * profile() call
 */
@Domain("Profiler")
@EventName("consoleProfileStarted")
@Data
public class ConsoleProfileStarted {

    private String id;
    /**
     * Location of console.profile().
     */
    private Location location;
    /**
     * Profile title passed as an argument to console.profile().
     */
    private String title;

}
