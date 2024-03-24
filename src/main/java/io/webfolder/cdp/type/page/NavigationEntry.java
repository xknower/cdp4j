package io.webfolder.cdp.type.page;

import lombok.Data;

/**
 * Navigation history entry
 */
@Data
public class NavigationEntry {

    /**
     * Unique id of the navigation history entry.
     */
    private Integer id;
    /**
     * URL of the navigation history entry.
     */
    private String url;
    /**
     * URL that the user typed in the url bar.
     */
    private String userTypedURL;
    /**
     * Title of the navigation history entry.
     */
    private String title;
    /**
     * Transition type.
     */
    private TransitionType transitionType;

}
