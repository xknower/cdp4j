package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * A cache has been added/deleted
 */
@Domain("Storage")
@EventName("cacheStorageListUpdated")
@Data
public class CacheStorageListUpdated {

    /**
     * Origin to update.
     */
    private String origin;

}
