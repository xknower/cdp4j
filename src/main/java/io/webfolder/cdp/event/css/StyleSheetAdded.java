package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.css.CSSStyleSheetHeader;

/**
 * Fired whenever an active document stylesheet is added
 */
@Domain("CSS")
@EventName("styleSheetAdded")
public class StyleSheetAdded {
    private CSSStyleSheetHeader header;

    /**
     * Added stylesheet metainfo.
     */
    public CSSStyleSheetHeader getHeader() {
        return header;
    }

    /**
     * Added stylesheet metainfo.
     */
    public void setHeader(CSSStyleSheetHeader header) {
        this.header = header;
    }
}
