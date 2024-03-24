package io.webfolder.cdp.type.css;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Media query descriptor
 */
@Data
public class MediaQuery {

    /**
     * Array of media query expressions.
     */
    private List<MediaQueryExpression> expressions = new ArrayList<>();
    /**
     * Whether the media query condition is satisfied.
     */
    private Boolean active;

}
