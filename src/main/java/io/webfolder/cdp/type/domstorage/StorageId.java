package io.webfolder.cdp.type.domstorage;

import lombok.Data;

/**
 * DOM Storage identifier
 */
@Data
public class StorageId {

    /**
     * Security origin for the storage.
     */
    private String securityOrigin;
    /**
     * Whether the storage is local storage (not session storage).
     */
    private Boolean isLocalStorage;

}
