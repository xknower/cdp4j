package io.webfolder.cdp.type.storage;

import lombok.Data;

/**
 * Usage for a storage type
 */
@Data
public class UsageForType {

    /**
     * Name of storage type.
     */
    private StorageType storageType;
    /**
     * Storage usage (bytes).
     */
    private Double usage;

}
