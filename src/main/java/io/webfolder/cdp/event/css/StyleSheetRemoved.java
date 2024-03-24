package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired whenever an active document stylesheet is removed
 */
@Domain("CSS")
@EventName("styleSheetRemoved")
@Data
public class StyleSheetRemoved {

    /**
     * Identifier of the removed stylesheet.
     */
    private String styleSheetId;

}
