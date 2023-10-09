package io.webfolder.cdp.event.domstorage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.domstorage.StorageId;

@Domain("DOMStorage")
@EventName("domStorageItemsCleared")
public class DomStorageItemsCleared {
    private StorageId storageId;

    public StorageId getStorageId() {
        return storageId;
    }

    public void setStorageId(StorageId storageId) {
        this.storageId = storageId;
    }
}
