package io.webfolder.cdp.type.css;

import lombok.Data;

@Data
public class ShorthandEntry {

    /**
     * Shorthand name.
     */
    private String name;
    /**
     * Shorthand value.
     */
    private String value;
    /**
     * Whether the property has "!important" annotation (implies <code>false</code> if absent).
     */
    private Boolean important;

}
