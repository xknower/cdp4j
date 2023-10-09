package io.webfolder.cdp.type.fetch;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.ResourceType;

@Experimental
public class RequestPattern {
    private String urlPattern;

    private ResourceType resourceType;

    private RequestStage requestStage;

    /**
     * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
     * backslash. Omitting is equivalent to "*".
     */
    public String getUrlPattern() {
        return urlPattern;
    }

    /**
     * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
     * backslash. Omitting is equivalent to "*".
     */
    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    /**
     * If set, only requests for matching resource types will be intercepted.
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * If set, only requests for matching resource types will be intercepted.
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Stage at wich to begin intercepting requests. Default is Request.
     */
    public RequestStage getRequestStage() {
        return requestStage;
    }

    /**
     * Stage at wich to begin intercepting requests. Default is Request.
     */
    public void setRequestStage(RequestStage requestStage) {
        this.requestStage = requestStage;
    }
}
