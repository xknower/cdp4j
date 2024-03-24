package io.webfolder.cdp.type.indexeddb;

import io.webfolder.cdp.type.constant.KeyPathType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Key path
 */
@Data
public class KeyPath {

    /**
     * Key path type.
     */
    private KeyPathType type;
    /**
     * String value.
     */
    private String string;
    /**
     * Array value.
     */
    private List<String> array = new ArrayList<>();

}
