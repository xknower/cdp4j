package io.webfolder.cdp.type.profiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Coverage data for a JavaScript script
 */
public class ScriptCoverage {
    private String scriptId;

    private String url;

    private List<FunctionCoverage> functions = new ArrayList<>();

    /**
     * JavaScript script id.
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * JavaScript script id.
     */
    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * JavaScript script name or url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * JavaScript script name or url.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Functions contained in the script that has coverage data.
     */
    public List<FunctionCoverage> getFunctions() {
        return functions;
    }

    /**
     * Functions contained in the script that has coverage data.
     */
    public void setFunctions(List<FunctionCoverage> functions) {
        this.functions = functions;
    }
}
