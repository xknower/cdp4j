package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Issued for every compilation cache generated
 * Is only available
 * if Page
 * setGenerateCompilationCache is enabled
 */
@Experimental
@Domain("Page")
@EventName("compilationCacheProduced")
@Data
public class CompilationCacheProduced {

    private String url;
    /**
     * Base64-encoded data
     */
    private String data;

}
