package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.Node;
import lombok.Data;

/**
 * Called when a pseudo element is added to an element
 */
@Experimental
@Domain("DOM")
@EventName("pseudoElementAdded")
@Data
public class PseudoElementAdded {

    /**
     * Pseudo element's parent element id.
     */
    private Integer parentId;
    /**
     * The added pseudo element.
     */
    private Node pseudoElement;

}
