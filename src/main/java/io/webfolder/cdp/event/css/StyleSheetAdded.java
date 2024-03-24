package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.css.CSSStyleSheetHeader;
import lombok.Data;

/**
 * Fired whenever an active document stylesheet is added
 */
@Domain("CSS")
@EventName("styleSheetAdded")
@Data
public class StyleSheetAdded {

    /**
     * Added stylesheet metainfo.
     */
    private CSSStyleSheetHeader header;

}
