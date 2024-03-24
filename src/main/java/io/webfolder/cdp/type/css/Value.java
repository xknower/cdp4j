package io.webfolder.cdp.type.css;

import lombok.Data;

/**
 * Data for a simple selector (these are delimited by commas in a selector list)
 */
@Data
public class Value {

    /**
     * Value text.
     */
    private String text;
    /**
     * Value range in the underlying resource (if available).
     */
    private SourceRange range;

}
