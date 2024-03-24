package io.webfolder.cdp.type.fetch;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.ResourceType;
import lombok.Data;

@Experimental
@Data
public class RequestPattern {

    /**
     * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
     * backslash. Omitting is equivalent to "*".
     */
    private String urlPattern;
    /**
     * If set, only requests for matching resource types will be intercepted.
     */
    private ResourceType resourceType;
    /**
     * Stage at wich to begin intercepting requests. Default is Request.
     */
    private RequestStage requestStage;

}
