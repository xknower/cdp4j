package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when <code>Element</code>'s attribute is modified
 */
@Domain("DOM")
@EventName("attributeModified")
@Data
public class AttributeModified {

    /**
     * Id of the node that has changed.
     */
    private Integer nodeId;
    /**
     * Attribute name.
     */
    private String name;
    /**
     * Attribute value.
     */
    private String value;

}
