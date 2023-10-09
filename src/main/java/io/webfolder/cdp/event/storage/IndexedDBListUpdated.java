package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * The origin's IndexedDB database list has been modified
 */
@Domain("Storage")
@EventName("indexedDBListUpdated")
public class IndexedDBListUpdated {
    private String origin;

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
}
