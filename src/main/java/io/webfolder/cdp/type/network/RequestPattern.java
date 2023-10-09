package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Request pattern for interception
 */
@Experimental
public class RequestPattern {
    private String urlPattern;

    private ResourceType resourceType;

    private InterceptionStage interceptionStage;

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
    public InterceptionStage getInterceptionStage() {
        return interceptionStage;
    }

    /**
     * Stage at wich to begin intercepting requests. Default is Request.
     */
    public void setInterceptionStage(InterceptionStage interceptionStage) {
        this.interceptionStage = interceptionStage;
    }
}
