package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.constant.BreakLocationType;
import lombok.Data;

@Data
public class BreakLocation {

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

    private BreakLocationType type;

}
