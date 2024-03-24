package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

import java.util.List;

/**
 * Fired when a new window is going to be opened, via window
 * open(), link click, form submission,
 * etc
 */
@Domain("Page")
@EventName("windowOpen")
@Data
public class WindowOpen {

    /**
     * The URL for the new window.
     */
    private String url;
    /**
     * Window name.
     */
    private String windowName;
    /**
     * An array of enabled window features.
     */
    private List<String> windowFeatures;
    /**
     * Whether or not it was triggered by user gesture.
     */
    private Boolean userGesture;

}
