package io.webfolder.cdp.type.css;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A subset of the full ComputedStyle as defined by the request whitelist
 */
@Experimental
@Data
public class ComputedStyle {

    private List<CSSComputedStyleProperty> properties = new ArrayList<>();

}
