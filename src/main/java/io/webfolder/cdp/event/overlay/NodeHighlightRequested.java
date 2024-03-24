package io.webfolder.cdp.event.overlay;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when the node should be highlighted
 * This happens after call to <code>setInspectMode</code>
 */
@Domain("Overlay")
@EventName("nodeHighlightRequested")
@Data
public class NodeHighlightRequested {

    private Integer nodeId;

}
