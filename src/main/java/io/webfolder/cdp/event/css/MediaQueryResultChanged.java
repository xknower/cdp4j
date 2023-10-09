package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fires whenever a MediaQuery result changes (for example, after a browser window has been
 * resized
 * ) The current implementation considers only viewport-dependent media features
 */
@Domain("CSS")
@EventName("mediaQueryResultChanged")
public class MediaQueryResultChanged {
}
