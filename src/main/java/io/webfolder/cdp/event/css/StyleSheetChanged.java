package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired whenever a stylesheet is changed as a result of the client operation
 */
@Domain("CSS")
@EventName("styleSheetChanged")
public class StyleSheetChanged {
    private String styleSheetId;

    public String getStyleSheetId() {
        return styleSheetId;
    }

    public void setStyleSheetId(String styleSheetId) {
        this.styleSheetId = styleSheetId;
    }
}
