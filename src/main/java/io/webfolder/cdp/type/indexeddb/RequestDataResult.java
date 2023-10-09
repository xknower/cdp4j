package io.webfolder.cdp.type.indexeddb;

import java.util.List;

public class RequestDataResult {
    private List<DataEntry> objectStoreDataEntries;

    private Boolean hasMore;

    public List<DataEntry> getObjectStoreDataEntries() {
        return objectStoreDataEntries;
    }

    public Boolean getHasMore() {
        return hasMore;
    }
}
