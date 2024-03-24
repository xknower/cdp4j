package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * A cache's contents have been modified
 */
@Domain("Storage")
@EventName("cacheStorageContentUpdated")
@Data
public class CacheStorageContentUpdated {

    /**
     * Origin to update.
     */
    private String origin;
    /**
     * Name of cache in origin.
     */
    private String cacheName;

}
