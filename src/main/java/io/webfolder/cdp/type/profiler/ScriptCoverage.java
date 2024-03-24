package io.webfolder.cdp.type.profiler;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Coverage data for a JavaScript script
 */
@Data
public class ScriptCoverage {

    /**
     * JavaScript script id.
     */
    private String scriptId;
    /**
     * JavaScript script name or url.
     */
    private String url;
    /**
     * Functions contained in the script that has coverage data.
     */
    private List<FunctionCoverage> functions = new ArrayList<>();

}
