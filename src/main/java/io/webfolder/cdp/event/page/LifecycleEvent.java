package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired for top level page lifecycle events such as navigation, load, paint, etc
 */
@Domain("Page")
@EventName("lifecycleEvent")
@Data
public class LifecycleEvent {

    /**
     * Id of the frame.
     */
    private String frameId;
    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    private String loaderId;

    private String name;

    private Double timestamp;

}
