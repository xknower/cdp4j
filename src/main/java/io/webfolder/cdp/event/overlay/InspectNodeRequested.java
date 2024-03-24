package io.webfolder.cdp.event.overlay;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when the node should be inspected
 * This happens after call to <code>setInspectMode</code> or when
 * user manually inspects an element
 */
@Domain("Overlay")
@EventName("inspectNodeRequested")
@Data
public class InspectNodeRequested {

    /**
     * Id of the node to inspect.
     */
    private Integer backendNodeId;

}
