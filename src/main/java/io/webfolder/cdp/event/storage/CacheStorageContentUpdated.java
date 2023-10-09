package io.webfolder.cdp.event.storage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * A cache's contents have been modified
 */
@Domain("Storage")
@EventName("cacheStorageContentUpdated")
public class CacheStorageContentUpdated {
    private String origin;

    private String cacheName;

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
     * Name of cache in origin.
     */
    public String getCacheName() {
        return cacheName;
    }

    /**
     * Name of cache in origin.
     */
    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }
}
