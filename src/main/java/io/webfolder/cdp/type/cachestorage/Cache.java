package io.webfolder.cdp.type.cachestorage;

import lombok.Data;

/**
 * Cache identifier
 */
@Data
public class Cache {

    /**
     * An opaque unique id of the cache.
     */
    private String cacheId;
    /**
     * Security origin of the cache.
     */
    private String securityOrigin;
    /**
     * The name of the cache.
     */
    private String cacheName;

}
