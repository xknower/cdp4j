package io.webfolder.cdp.event.domstorage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.domstorage.StorageId;

@Domain("DOMStorage")
@EventName("domStorageItemRemoved")
public class DomStorageItemRemoved {
    private StorageId storageId;

    private String key;

    public StorageId getStorageId() {
        return storageId;
    }

    public void setStorageId(StorageId storageId) {
        this.storageId = storageId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
