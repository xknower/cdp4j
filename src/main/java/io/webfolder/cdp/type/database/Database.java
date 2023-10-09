package io.webfolder.cdp.type.database;

/**
 * Database object
 */
public class Database {
    private String id;

    private String domain;

    private String name;

    private String version;

    /**
     * Database ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Database ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Database domain.
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Database domain.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

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
    public String getVersion() {
        return version;
    }

    /**
     * Database version.
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
