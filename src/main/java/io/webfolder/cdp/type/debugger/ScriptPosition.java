package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Location in the source code
 */
@Experimental
public class ScriptPosition {
    private Integer lineNumber;

    private Integer columnNumber;

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(Integer columnNumber) {
        this.columnNumber = columnNumber;
    }
}
