package io.webfolder.cdp.type.debugger;

/**
 * Location in the source code
 */
public class Location {
    private String scriptId;

    private Integer lineNumber;

    private Integer columnNumber;

    /**
     * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
     */
    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * Line number in the script (0-based).
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Line number in the script (0-based).
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Column number in the script (0-based).
     */
    public Integer getColumnNumber() {
        return columnNumber;
    }

    /**
     * Column number in the script (0-based).
     */
    public void setColumnNumber(Integer columnNumber) {
        this.columnNumber = columnNumber;
    }
}
