package io.webfolder.cdp.event.fetch;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.fetch.HeaderEntry;
import io.webfolder.cdp.type.network.ErrorReason;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.ResourceType;

import java.util.ArrayList;
import java.util.List;

/**
 * Issued when the domain is enabled and the request URL matches the
 * specified filter
 * The request is paused until the client responds
 * with one of continueRequest, failRequest or fulfillRequest
 * The stage of the request can be determined by presence of responseErrorReason
 * and responseStatusCode -- the request is at the response stage if either
 * of these fields is present and in the request stage otherwise
 */
@Domain("Fetch")
@EventName("requestPaused")
public class RequestPaused {
    private String requestId;

    private Request request;

    private String frameId;

    private ResourceType resourceType;

    private ErrorReason responseErrorReason;

    private Integer responseStatusCode;

    private List<HeaderEntry> responseHeaders = new ArrayList<>();

    /**
     * Each request the page makes will have a unique id.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Each request the page makes will have a unique id.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * The details of the request.
     */
    public Request getRequest() {
        return request;
    }

    /**
     * The details of the request.
     */
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
     * Response error if intercepted at response stage.
     */
    public ErrorReason getResponseErrorReason() {
        return responseErrorReason;
    }

    /**
     * Response error if intercepted at response stage.
     */
    public void setResponseErrorReason(ErrorReason responseErrorReason) {
        this.responseErrorReason = responseErrorReason;
    }

    /**
     * Response code if intercepted at response stage.
     */
    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Response code if intercepted at response stage.
     */
    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * Response headers if intercepted at the response stage.
     */
    public List<HeaderEntry> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Response headers if intercepted at the response stage.
     */
    public void setResponseHeaders(List<HeaderEntry> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }
}
