package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.Node;
import lombok.Data;

/**
 * Called when shadow root is pushed into the element
 */
@Experimental
@Domain("DOM")
@EventName("shadowRootPushed")
@Data
public class ShadowRootPushed {

    /**
     * Host element id.
     */
    private Integer hostId;
    /**
     * Shadow root.
     */
    private Node root;

}
