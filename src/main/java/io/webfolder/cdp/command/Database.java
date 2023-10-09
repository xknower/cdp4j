package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.database.ExecuteSQLResult;

import java.util.List;

@Experimental
@Domain("Database")
public interface Database {
    /**
     * Disables database tracking, prevents database events from being sent to the client.
     */
    void disable();

    /**
     * Enables database tracking, database events will now be delivered to the client.
     */
    void enable();

    /**
     * @return ExecuteSQLResult
     */
    ExecuteSQLResult executeSQL(String databaseId, String query);

    @Returns("tableNames")
    List<String> getDatabaseTableNames(String databaseId);
}
