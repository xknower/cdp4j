package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.domstorage.StorageId;

import java.util.List;

/**
 * Query and modify DOM storage
 */
@Experimental
@Domain("DOMStorage")
public interface DOMStorage {
    void clear(StorageId storageId);

    /**
     * Disables storage tracking, prevents storage events from being sent to the client.
     */
    void disable();

    /**
     * Enables storage tracking, storage events will now be delivered to the client.
     */
    void enable();

    @Returns("entries")
    List<String> getDOMStorageItems(StorageId storageId);

    void removeDOMStorageItem(StorageId storageId, String key);

    void setDOMStorageItem(StorageId storageId, String key, String value);
}
