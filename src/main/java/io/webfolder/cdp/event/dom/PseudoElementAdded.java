package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.Node;

/**
 * Called when a pseudo element is added to an element
 */
@Experimental
@Domain("DOM")
@EventName("pseudoElementAdded")
public class PseudoElementAdded {
    private Integer parentId;

    private Node pseudoElement;

    /**
     * Pseudo element's parent element id.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Pseudo element's parent element id.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * The added pseudo element.
     */
    public Node getPseudoElement() {
        return pseudoElement;
    }

    /**
     * The added pseudo element.
     */
    public void setPseudoElement(Node pseudoElement) {
        this.pseudoElement = pseudoElement;
    }
}
