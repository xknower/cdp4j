package io.webfolder.cdp.type.profiler;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Type profile data collected during runtime for a JavaScript script
 */
@Experimental
public class ScriptTypeProfile {
    private String scriptId;

    private String url;

    private List<TypeProfileEntry> entries = new ArrayList<>();

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
     * Type profile entries for parameters and return values of the functions in the script.
     */
    public List<TypeProfileEntry> getEntries() {
        return entries;
    }

    /**
     * Type profile entries for parameters and return values of the functions in the script.
     */
    public void setEntries(List<TypeProfileEntry> entries) {
        this.entries = entries;
    }
}
