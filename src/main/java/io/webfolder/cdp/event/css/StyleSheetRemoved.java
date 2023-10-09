package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired whenever an active document stylesheet is removed
 */
@Domain("CSS")
@EventName("styleSheetRemoved")
public class StyleSheetRemoved {
    private String styleSheetId;

    /**
     * Identifier of the removed stylesheet.
     */
    public String getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Identifier of the removed stylesheet.
     */
    public void setStyleSheetId(String styleSheetId) {
        this.styleSheetId = styleSheetId;
    }
}
