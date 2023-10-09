package io.webfolder.cdp.type.indexeddb;

import io.webfolder.cdp.type.constant.KeyPathType;

import java.util.ArrayList;
import java.util.List;

/**
 * Key path
 */
public class KeyPath {
    private KeyPathType type;

    private String string;

    private List<String> array = new ArrayList<>();

    /**
     * Key path type.
     */
    public KeyPathType getType() {
        return type;
    }

    /**
     * Key path type.
     */
    public void setType(KeyPathType type) {
        this.type = type;
    }

    /**
     * String value.
     */
    public String getString() {
        return string;
    }

    /**
     * String value.
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Array value.
     */
    public List<String> getArray() {
        return array;
    }

    /**
     * Array value.
     */
    public void setArray(List<String> array) {
        this.array = array;
    }
}
