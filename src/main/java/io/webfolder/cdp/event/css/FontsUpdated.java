package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.css.FontFace;

/**
 * Fires whenever a web font is updated
 * A non-empty font parameter indicates a successfully loaded
 * web font
 */
@Domain("CSS")
@EventName("fontsUpdated")
public class FontsUpdated {
    private FontFace font;

    /**
     * The web font that has loaded.
     */
    public FontFace getFont() {
        return font;
    }

    /**
     * The web font that has loaded.
     */
    public void setFont(FontFace font) {
        this.font = font;
    }
}
