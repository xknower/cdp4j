package io.webfolder.cdp.type.indexeddb;

import lombok.Getter;

import java.util.List;

@Getter
public class RequestDataResult {

    private List<DataEntry> objectStoreDataEntries;

    private Boolean hasMore;

}
