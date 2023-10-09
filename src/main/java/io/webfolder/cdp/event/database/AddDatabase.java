package io.webfolder.cdp.event.database;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.database.Database;

@Domain("Database")
@EventName("addDatabase")
public class AddDatabase {
    private Database database;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
