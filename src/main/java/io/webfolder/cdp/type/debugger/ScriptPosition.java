package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Location in the source code
 */
@Experimental
@Data
public class ScriptPosition {

    private Integer lineNumber;

    private Integer columnNumber;

}
