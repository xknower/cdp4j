package io.webfolder.cdp.type.cachestorage;

import java.util.List;

public class RequestEntriesResult {
    private List<DataEntry> cacheDataEntries;

    private Boolean hasMore;

    public List<DataEntry> getCacheDataEntries() {
        return cacheDataEntries;
    }

    public Boolean getHasMore() {
        return hasMore;
    }
}
