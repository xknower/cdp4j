package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when a navigation is started if navigation throttles are enabled
 * The navigation will be deferred until processNavigation is called
 */
@Domain("Page")
@EventName("navigationRequested")
@Data
public class NavigationRequested {

    /**
     * Whether the navigation is taking place in the main frame or in a subframe.
     */
    private Boolean isInMainFrame;
    /**
     * Whether the navigation has encountered a server redirect or not.
     */
    private Boolean isRedirect;

    private Integer navigationId;
    /**
     * URL of requested navigation.
     */
    private String url;

}
