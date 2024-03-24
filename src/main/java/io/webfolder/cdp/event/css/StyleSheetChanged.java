package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired whenever a stylesheet is changed as a result of the client operation
 */
@Domain("CSS")
@EventName("styleSheetChanged")
@Data
public class StyleSheetChanged {

    private String styleSheetId;

}
