package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.storage.GetUsageAndQuotaResult;

@Experimental
@Domain("Storage")
public interface Storage {
    /**
     * Clears storage for origin.
     *
     * @param origin       Security origin.
     * @param storageTypes Comma separated origin names.
     */
    void clearDataForOrigin(String origin, String storageTypes);

    /**
     * Returns usage and quota in bytes.
     *
     * @param origin Security origin.
     * @return GetUsageAndQuotaResult
     */
    GetUsageAndQuotaResult getUsageAndQuota(String origin);

    /**
     * Registers origin to be notified when an update occurs to its cache storage list.
     *
     * @param origin Security origin.
     */
    void trackCacheStorageForOrigin(String origin);

    /**
     * Registers origin to be notified when an update occurs to its IndexedDB.
     *
     * @param origin Security origin.
     */
    void trackIndexedDBForOrigin(String origin);

    /**
     * Unregisters origin from receiving notifications for cache storage.
     *
     * @param origin Security origin.
     */
    void untrackCacheStorageForOrigin(String origin);

    /**
     * Unregisters origin from receiving notifications for IndexedDB.
     *
     * @param origin Security origin.
     */
    void untrackIndexedDBForOrigin(String origin);
}
