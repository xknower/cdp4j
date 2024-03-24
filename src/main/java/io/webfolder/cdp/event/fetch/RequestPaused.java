package io.webfolder.cdp.event.fetch;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.fetch.HeaderEntry;
import io.webfolder.cdp.type.network.ErrorReason;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.ResourceType;
import lombok.Data;

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
@Data
public class RequestPaused {

    /**
     * Each request the page makes will have a unique id.
     */
    private String requestId;
    /**
     * The details of the request.
     */
    private Request request;
    /**
     * The id of the frame that initiated the request.
     */
    private String frameId;
    /**
     * How the requested resource will be used.
     */
    private ResourceType resourceType;
    /**
     * Response error if intercepted at response stage.
     */
    private ErrorReason responseErrorReason;
    /**
     * Response code if intercepted at response stage.
     */
    private Integer responseStatusCode;
    /**
     * Response headers if intercepted at the response stage.
     */
    private List<HeaderEntry> responseHeaders = new ArrayList<>();

}
