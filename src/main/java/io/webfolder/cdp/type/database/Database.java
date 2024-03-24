package io.webfolder.cdp.type.database;

import lombok.Data;

/**
 * Database object
 */
@Data
public class Database {

    /**
     * Database ID.
     */
    private String id;
    /**
     * Database domain.
     */
    private String domain;
    /**
     * Database name.
     */
    private String name;
    /**
     * Database version.
     */
    private String version;

}
