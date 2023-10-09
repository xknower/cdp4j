package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.AuthChallenge;
import io.webfolder.cdp.type.network.ErrorReason;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.ResourceType;

import java.util.HashMap;
import java.util.Map;

/**
 * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
 * mocked
 */
@Experimental
@Domain("Network")
@EventName("requestIntercepted")
public class RequestIntercepted {
    private String interceptionId;

    private Request request;

    private String frameId;

    private ResourceType resourceType;

    private Boolean isNavigationRequest;

    private Boolean isDownload;

    private String redirectUrl;

    private AuthChallenge authChallenge;

    private ErrorReason responseErrorReason;

    private Integer responseStatusCode;

    private Map<String, Object> responseHeaders = new HashMap<>();

    /**
     * Each request the page makes will have a unique id, however if any redirects are encountered
     * while processing that fetch, they will be reported with the same id as the original fetch.
     * Likewise if HTTP authentication is needed then the same fetch id will be used.
     */
    public String getInterceptionId() {
        return interceptionId;
    }

    /**
     * Each request the page makes will have a unique id, however if any redirects are encountered
     * while processing that fetch, they will be reported with the same id as the original fetch.
     * Likewise if HTTP authentication is needed then the same fetch id will be used.
     */
    public void setInterceptionId(String interceptionId) {
        this.interceptionId = interceptionId;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * The id of the frame that initiated the request.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * The id of the frame that initiated the request.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    /**
     * How the requested resource will be used.
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * How the requested resource will be used.
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Whether this is a navigation request, which can abort the navigation completely.
     */
    public Boolean isIsNavigationRequest() {
        return isNavigationRequest;
    }

    /**
     * Whether this is a navigation request, which can abort the navigation completely.
     */
    public void setIsNavigationRequest(Boolean isNavigationRequest) {
        this.isNavigationRequest = isNavigationRequest;
    }

    /**
     * Set if the request is a navigation that will result in a download.
     * Only present after response is received from the server (i.e. HeadersReceived stage).
     */
    public Boolean isIsDownload() {
        return isDownload;
    }

    /**
     * Set if the request is a navigation that will result in a download.
     * Only present after response is received from the server (i.e. HeadersReceived stage).
     */
    public void setIsDownload(Boolean isDownload) {
        this.isDownload = isDownload;
    }

    /**
     * Redirect location, only sent if a redirect was intercepted.
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Redirect location, only sent if a redirect was intercepted.
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * Details of the Authorization Challenge encountered. If this is set then
     * continueInterceptedRequest must contain an authChallengeResponse.
     */
    public AuthChallenge getAuthChallenge() {
        return authChallenge;
    }

    /**
     * Details of the Authorization Challenge encountered. If this is set then
     * continueInterceptedRequest must contain an authChallengeResponse.
     */
    public void setAuthChallenge(AuthChallenge authChallenge) {
        this.authChallenge = authChallenge;
    }

    /**
     * Response error if intercepted at response stage or if redirect occurred while intercepting
     * request.
     */
    public ErrorReason getResponseErrorReason() {
        return responseErrorReason;
    }

    /**
     * Response error if intercepted at response stage or if redirect occurred while intercepting
     * request.
     */
    public void setResponseErrorReason(ErrorReason responseErrorReason) {
        this.responseErrorReason = responseErrorReason;
    }

    /**
     * Response code if intercepted at response stage or if redirect occurred while intercepting
     * request or auth retry occurred.
     */
    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Response code if intercepted at response stage or if redirect occurred while intercepting
     * request or auth retry occurred.
     */
    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * Response headers if intercepted at the response stage or if redirect occurred while
     * intercepting request or auth retry occurred.
     */
    public Map<String, Object> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Response headers if intercepted at the response stage or if redirect occurred while
     * intercepting request or auth retry occurred.
     */
    public void setResponseHeaders(Map<String, Object> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }
}
