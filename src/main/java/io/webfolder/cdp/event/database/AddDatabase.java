package io.webfolder.cdp.event.database;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.database.Database;
import lombok.Data;

@Domain("Database")
@EventName("addDatabase")
@Data
public class AddDatabase {

    private Database database;

}
