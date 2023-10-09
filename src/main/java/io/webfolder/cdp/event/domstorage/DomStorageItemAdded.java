package io.webfolder.cdp.event.domstorage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.domstorage.StorageId;

@Domain("DOMStorage")
@EventName("domStorageItemAdded")
public class DomStorageItemAdded {
    private StorageId storageId;

    private String key;

    private String newValue;

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

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
