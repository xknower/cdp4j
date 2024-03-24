package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Mirrors <code>DOMNodeRemoved</code> event
 */
@Domain("DOM")
@EventName("childNodeRemoved")
@Data
public class ChildNodeRemoved {
    /**
     * Parent id.
     */
    private Integer parentNodeId;
    /**
     * Id of the node that has been removed.
     */
    private Integer nodeId;

}
