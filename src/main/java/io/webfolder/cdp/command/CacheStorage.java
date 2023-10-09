package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.cachestorage.Cache;
import io.webfolder.cdp.type.cachestorage.CachedResponse;
import io.webfolder.cdp.type.cachestorage.RequestEntriesResult;

import java.util.List;

@Experimental
@Domain("CacheStorage")
public interface CacheStorage {
    /**
     * Deletes a cache.
     *
     * @param cacheId Id of cache for deletion.
     */
    void deleteCache(String cacheId);

    /**
     * Deletes a cache entry.
     *
     * @param cacheId Id of cache where the entry will be deleted.
     * @param request URL spec of the request.
     */
    void deleteEntry(String cacheId, String request);

    /**
     * Requests cache names.
     *
     * @param securityOrigin Security origin.
     * @return Caches for the security origin.
     */
    @Returns("caches")
    List<Cache> requestCacheNames(String securityOrigin);

    /**
     * Fetches cache entry.
     *
     * @param cacheId    Id of cache that contains the enty.
     * @param requestURL URL spec of the request.
     * @return Response read from the cache.
     */
    @Returns("response")
    CachedResponse requestCachedResponse(String cacheId, String requestURL);

    /**
     * Requests data from cache.
     *
     * @param cacheId   ID of cache to get entries from.
     * @param skipCount Number of records to skip.
     * @param pageSize  Number of records to fetch.
     * @return RequestEntriesResult
     */
    RequestEntriesResult requestEntries(String cacheId, Integer skipCount, Integer pageSize);
}
