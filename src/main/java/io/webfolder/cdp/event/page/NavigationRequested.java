package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when a navigation is started if navigation throttles are enabled
 * The navigation will be deferred until processNavigation is called
 */
@Domain("Page")
@EventName("navigationRequested")
public class NavigationRequested {
    private Boolean isInMainFrame;

    private Boolean isRedirect;

    private Integer navigationId;

    private String url;

    /**
     * Whether the navigation is taking place in the main frame or in a subframe.
     */
    public Boolean isIsInMainFrame() {
        return isInMainFrame;
    }

    /**
     * Whether the navigation is taking place in the main frame or in a subframe.
     */
    public void setIsInMainFrame(Boolean isInMainFrame) {
        this.isInMainFrame = isInMainFrame;
    }

    /**
     * Whether the navigation has encountered a server redirect or not.
     */
    public Boolean isIsRedirect() {
        return isRedirect;
    }

    /**
     * Whether the navigation has encountered a server redirect or not.
     */
    public void setIsRedirect(Boolean isRedirect) {
        this.isRedirect = isRedirect;
    }

    public Integer getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Integer navigationId) {
        this.navigationId = navigationId;
    }

    /**
     * URL of requested navigation.
     */
    public String getUrl() {
        return url;
    }

    /**
     * URL of requested navigation.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
