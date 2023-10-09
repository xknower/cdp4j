package io.webfolder.cdp.event.profiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.debugger.Location;

/**
 * Sent when new profile recording is started using console
 * profile() call
 */
@Domain("Profiler")
@EventName("consoleProfileStarted")
public class ConsoleProfileStarted {
    private String id;

    private Location location;

    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Location of console.profile().
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Location of console.profile().
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Profile title passed as an argument to console.profile().
     */
    public String getTitle() {
        return title;
    }

    /**
     * Profile title passed as an argument to console.profile().
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
