package io.webfolder.cdp.type.debugger;

import lombok.Data;

/**
 * Location in the source code
 */
@Data
public class Location {

    /**
     * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
     */
    private String scriptId;
    /**
     * Line number in the script (0-based).
     */
    private Integer lineNumber;
    /**
     * Column number in the script (0-based).
     */
    private Integer columnNumber;

}
