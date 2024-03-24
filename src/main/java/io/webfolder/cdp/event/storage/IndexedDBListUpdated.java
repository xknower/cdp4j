package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * The origin's IndexedDB database list has been modified
 */
@Domain("Storage")
@EventName("indexedDBListUpdated")
@Data
public class IndexedDBListUpdated {

    /**
     * Origin to update.
     */
    private String origin;

}
