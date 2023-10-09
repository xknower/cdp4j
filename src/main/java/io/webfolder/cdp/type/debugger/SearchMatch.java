package io.webfolder.cdp.type.debugger;

/**
 * Search match for resource
 */
public class SearchMatch {
    private Double lineNumber;

    private String lineContent;

    /**
     * Line number in resource content.
     */
    public Double getLineNumber() {
        return lineNumber;
    }

    /**
     * Line number in resource content.
     */
    public void setLineNumber(Double lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Line with match content.
     */
    public String getLineContent() {
        return lineContent;
    }

    /**
     * Line with match content.
     */
    public void setLineContent(String lineContent) {
        this.lineContent = lineContent;
    }
}
