package io.webfolder.cdp.type.css;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * A subset of the full ComputedStyle as defined by the request whitelist
 */
@Experimental
public class ComputedStyle {
    private List<CSSComputedStyleProperty> properties = new ArrayList<>();

    public List<CSSComputedStyleProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<CSSComputedStyleProperty> properties) {
        this.properties = properties;
    }
}
