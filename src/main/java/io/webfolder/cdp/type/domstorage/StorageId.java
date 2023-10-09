package io.webfolder.cdp.type.domstorage;

/**
 * DOM Storage identifier
 */
public class StorageId {
    private String securityOrigin;

    private Boolean isLocalStorage;

    /**
     * Security origin for the storage.
     */
    public String getSecurityOrigin() {
        return securityOrigin;
    }

    /**
     * Security origin for the storage.
     */
    public void setSecurityOrigin(String securityOrigin) {
        this.securityOrigin = securityOrigin;
    }

    /**
     * Whether the storage is local storage (not session storage).
     */
    public Boolean isIsLocalStorage() {
        return isLocalStorage;
    }

    /**
     * Whether the storage is local storage (not session storage).
     */
    public void setIsLocalStorage(Boolean isLocalStorage) {
        this.isLocalStorage = isLocalStorage;
    }
}
