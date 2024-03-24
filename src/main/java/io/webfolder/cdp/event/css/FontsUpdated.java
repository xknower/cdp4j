package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.css.FontFace;
import lombok.Data;

/**
 * Fires whenever a web font is updated
 * A non-empty font parameter indicates a successfully loaded
 * web font
 */
@Domain("CSS")
@EventName("fontsUpdated")
@Data
public class FontsUpdated {

    /**
     * The web font that has loaded.
     */
    private FontFace font;

}
