package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.ResourcePriority;
import lombok.Data;

/**
 * Fired when resource loading priority is changed
 */
@Experimental
@Domain("Network")
@EventName("resourceChangedPriority")
@Data
public class ResourceChangedPriority {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * New priority
     */
    private ResourcePriority newPriority;
    /**
     * Timestamp.
     */
    private Double timestamp;

}
