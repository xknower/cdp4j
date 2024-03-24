package io.webfolder.cdp.type.accessibility;

import lombok.Data;

@Data
public class AXProperty {

    /**
     * The name of this property.
     */
    private AXPropertyName name;
    /**
     * The value of this property.
     */
    private AXValue value;

}
