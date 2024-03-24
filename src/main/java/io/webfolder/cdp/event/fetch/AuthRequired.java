package io.webfolder.cdp.event.fetch;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.fetch.AuthChallenge;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.ResourceType;
import lombok.Data;

/**
 * Issued when the domain is enabled with handleAuthRequests set to true
 * The request is paused until client responds with continueWithAuth
 */
@Domain("Fetch")
@EventName("authRequired")
@Data
public class AuthRequired {

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
     * Details of the Authorization Challenge encountered.
     * If this is set, client should respond with continueRequest that
     * contains AuthChallengeResponse.
     */
    private AuthChallenge authChallenge;

}
