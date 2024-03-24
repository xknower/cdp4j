package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Mirrors <code>DOMCharacterDataModified</code> event
 */
@Domain("DOM")
@EventName("characterDataModified")
@Data
public class CharacterDataModified {

    /**
     * Id of the node that has changed.
     */
    private Integer nodeId;
    /**
     * New text value.
     */
    private String characterData;

}
