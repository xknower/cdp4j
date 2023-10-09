package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

import java.util.List;

/**
 * Fired when a new window is going to be opened, via window
 * open(), link click, form submission,
 * etc
 */
@Domain("Page")
@EventName("windowOpen")
public class WindowOpen {
    private String url;

    private String windowName;

    private List<String> windowFeatures;

    private Boolean userGesture;

    /**
     * The URL for the new window.
     */
    public String getUrl() {
        return url;
    }

    /**
     * The URL for the new window.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Window name.
     */
    public String getWindowName() {
        return windowName;
    }

    /**
     * Window name.
     */
    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    /**
     * An array of enabled window features.
     */
    public List<String> getWindowFeatures() {
        return windowFeatures;
    }

    /**
     * An array of enabled window features.
     */
    public void setWindowFeatures(List<String> windowFeatures) {
        this.windowFeatures = windowFeatures;
    }

    /**
     * Whether or not it was triggered by user gesture.
     */
    public Boolean isUserGesture() {
        return userGesture;
    }

    /**
     * Whether or not it was triggered by user gesture.
     */
    public void setUserGesture(Boolean userGesture) {
        this.userGesture = userGesture;
    }
}
