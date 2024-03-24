package io.webfolder.cdp.type.domsnapshot;

import lombok.Data;

/**
 * A name/value pair
 */
@Data
public class NameValue {

    /**
     * Attribute/property name.
     */
    private String name;
    /**
     * Attribute/property value.
     */
    private String value;

}
