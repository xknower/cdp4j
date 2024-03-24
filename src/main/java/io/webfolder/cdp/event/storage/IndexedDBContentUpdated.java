package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * The origin's IndexedDB object store has been modified
 */
@Domain("Storage")
@EventName("indexedDBContentUpdated")
@Data
public class IndexedDBContentUpdated {

    /**
     * Origin to update.
     */
    private String origin;
    /**
     * Database to update.
     */
    private String databaseName;
    /**
     * ObjectStore to update.
     */
    private String objectStoreName;

}
