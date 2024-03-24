package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Called when a pseudo element is removed from an element
 */
@Experimental
@Domain("DOM")
@EventName("pseudoElementRemoved")
@Data
public class PseudoElementRemoved {

    /**
     * Pseudo element's parent element id.
     */
    private Integer parentId;
    /**
     * The removed pseudo element id.
     */
    private Integer pseudoElementId;

}
