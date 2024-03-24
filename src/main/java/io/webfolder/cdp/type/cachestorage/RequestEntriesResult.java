package io.webfolder.cdp.type.cachestorage;

import lombok.Getter;

import java.util.List;

@Getter
public class RequestEntriesResult {

    private List<DataEntry> cacheDataEntries;

    private Boolean hasMore;

}
