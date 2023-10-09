package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired for top level page lifecycle events such as navigation, load, paint, etc
 */
@Domain("Page")
@EventName("lifecycleEvent")
public class LifecycleEvent {
    private String frameId;

    private String loaderId;

    private String name;

    private Double timestamp;

    /**
     * Id of the frame.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public String getLoaderId() {
        return loaderId;
    }

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public void setLoaderId(String loaderId) {
        this.loaderId = loaderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }
}
