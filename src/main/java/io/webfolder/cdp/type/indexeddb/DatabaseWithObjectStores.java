package io.webfolder.cdp.type.indexeddb;

import java.util.ArrayList;
import java.util.List;

/**
 * Database with an array of object stores
 */
public class DatabaseWithObjectStores {
    private String name;

    private Integer version;

    private List<ObjectStore> objectStores = new ArrayList<>();

    /**
     * Database name.
     */
    public String getName() {
        return name;
    }

    /**
     * Database name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Database version.
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Database version.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Object stores in this database.
     */
    public List<ObjectStore> getObjectStores() {
        return objectStores;
    }

    /**
     * Object stores in this database.
     */
    public void setObjectStores(List<ObjectStore> objectStores) {
        this.objectStores = objectStores;
    }
}
