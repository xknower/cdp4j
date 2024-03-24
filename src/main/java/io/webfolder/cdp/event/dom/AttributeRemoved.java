package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when <code>Element</code>'s attribute is removed
 */
@Domain("DOM")
@EventName("attributeRemoved")
@Data
public class AttributeRemoved {

    /**
     * Id of the node that has changed.
     */
    private Integer nodeId;
    /**
     * A ttribute name.
     */
    private String name;

}
