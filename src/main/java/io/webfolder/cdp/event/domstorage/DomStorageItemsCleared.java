package io.webfolder.cdp.event.domstorage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.domstorage.StorageId;
import lombok.Data;

@Domain("DOMStorage")
@EventName("domStorageItemsCleared")
@Data
public class DomStorageItemsCleared {

    private StorageId storageId;

}
