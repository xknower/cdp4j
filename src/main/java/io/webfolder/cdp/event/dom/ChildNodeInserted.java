package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.dom.Node;
import lombok.Data;

/**
 * Mirrors <code>DOMNodeInserted</code> event
 */
@Domain("DOM")
@EventName("childNodeInserted")
@Data
public class ChildNodeInserted {

    /**
     * Id of the node that has changed.
     */
    private Integer parentNodeId;
    /**
     * If of the previous siblint.
     */
    private Integer previousNodeId;
    /**
     * Inserted node data.
     */
    private Node node;

}
