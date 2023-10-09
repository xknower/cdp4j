package io.webfolder.cdp.event.log;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.log.LogEntry;

/**
 * Issued when new message was logged
 */
@Domain("Log")
@EventName("entryAdded")
public class EntryAdded {
    private LogEntry entry;

    /**
     * The entry.
     */
    public LogEntry getEntry() {
        return entry;
    }

    /**
     * The entry.
     */
    public void setEntry(LogEntry entry) {
        this.entry = entry;
    }
}
