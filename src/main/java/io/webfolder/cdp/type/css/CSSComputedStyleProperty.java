package io.webfolder.cdp.type.css;

import lombok.Data;

@Data
public class CSSComputedStyleProperty {

    /**
     * Computed style property name.
     */
    private String name;
    /**
     * Computed style property value.
     */
    private String value;

}
