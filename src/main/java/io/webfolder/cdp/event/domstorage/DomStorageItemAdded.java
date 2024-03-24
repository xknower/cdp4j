package io.webfolder.cdp.event.domstorage;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.domstorage.StorageId;
import lombok.Data;

@Domain("DOMStorage")
@EventName("domStorageItemAdded")
@Data
public class DomStorageItemAdded {

    private StorageId storageId;

    private String key;

    private String newValue;

}
