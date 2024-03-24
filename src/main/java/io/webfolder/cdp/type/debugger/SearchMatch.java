package io.webfolder.cdp.type.debugger;

import lombok.Data;

/**
 * Search match for resource
 */
@Data
public class SearchMatch {

    /**
     * Line number in resource content.
     */
    private Double lineNumber;
    /**
     * Line with match content.
     */
    private String lineContent;

}
