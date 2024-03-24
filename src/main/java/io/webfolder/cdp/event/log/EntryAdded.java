package io.webfolder.cdp.event.log;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.log.LogEntry;
import lombok.Data;

/**
 * Issued when new message was logged
 */
@Domain("Log")
@EventName("entryAdded")
@Data
public class EntryAdded {

    /**
     * The entry.
     */
    private LogEntry entry;

}
