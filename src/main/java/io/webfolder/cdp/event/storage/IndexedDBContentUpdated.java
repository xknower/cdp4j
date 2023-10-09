package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * The origin's IndexedDB object store has been modified
 */
@Domain("Storage")
@EventName("indexedDBContentUpdated")
public class IndexedDBContentUpdated {
    private String origin;

    private String databaseName;

    private String objectStoreName;

    /**
     * Origin to update.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin to update.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Database to update.
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database to update.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * ObjectStore to update.
     */
    public String getObjectStoreName() {
        return objectStoreName;
    }

    /**
     * ObjectStore to update.
     */
    public void setObjectStoreName(String objectStoreName) {
        this.objectStoreName = objectStoreName;
    }
}
