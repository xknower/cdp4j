package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Issued for every compilation cache generated
 * Is only available
 * if Page
 * setGenerateCompilationCache is enabled
 */
@Experimental
@Domain("Page")
@EventName("compilationCacheProduced")
public class CompilationCacheProduced {
    private String url;

    private String data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Base64-encoded data
     */
    public String getData() {
        return data;
    }

    /**
     * Base64-encoded data
     */
    public void setData(String data) {
        this.data = data;
    }
}
