package io.webfolder.cdp.type.indexeddb;

import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Data;

/**
 * Data entry
 */
@Data
public class DataEntry {

    /**
     * Key object.
     */
    private RemoteObject key;
    /**
     * Primary key object.
     */
    private RemoteObject primaryKey;
    /**
     * Value object.
     */
    private RemoteObject value;

}
