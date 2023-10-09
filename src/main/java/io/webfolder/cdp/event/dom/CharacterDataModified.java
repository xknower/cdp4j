package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Mirrors <code>DOMCharacterDataModified</code> event
 */
@Domain("DOM")
@EventName("characterDataModified")
public class CharacterDataModified {
    private Integer nodeId;

    private String characterData;

    /**
     * Id of the node that has changed.
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * Id of the node that has changed.
     */
    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * New text value.
     */
    public String getCharacterData() {
        return characterData;
    }

    /**
     * New text value.
     */
    public void setCharacterData(String characterData) {
        this.characterData = characterData;
    }
}
