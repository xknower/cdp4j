package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Request pattern for interception
 */
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
    private InterceptionStage interceptionStage;

}
