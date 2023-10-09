package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.fetch.AuthChallengeResponse;
import io.webfolder.cdp.type.fetch.GetResponseBodyResult;
import io.webfolder.cdp.type.fetch.HeaderEntry;
import io.webfolder.cdp.type.fetch.RequestPattern;
import io.webfolder.cdp.type.network.ErrorReason;

import java.util.List;

/**
 * A domain for letting clients substitute browser's network layer with client code
 */
@Experimental
@Domain("Fetch")
public interface Fetch {
    /**
     * Disables the fetch domain.
     */
    void disable();

    /**
     * Enables issuing of requestPaused events. A request will be paused until client
     * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
     *
     * @param patterns           If specified, only requests matching any of these patterns will produce
     *                           fetchRequested event and will be paused until clients response. If not set,
     *                           all requests will be affected.
     * @param handleAuthRequests If true, authRequired events will be issued and requests will be paused
     *                           expecting a call to continueWithAuth.
     */
    void enable(@Optional List<RequestPattern> patterns, @Optional Boolean handleAuthRequests);

    /**
     * Causes the request to fail with specified reason.
     *
     * @param requestId   An id the client received in requestPaused event.
     * @param errorReason Causes the request to fail with the given reason.
     */
    void failRequest(String requestId, ErrorReason errorReason);

    /**
     * Provides response to the request.
     *
     * @param requestId       An id the client received in requestPaused event.
     * @param responseCode    An HTTP response code.
     * @param responseHeaders Response headers.
     * @param body            A response body.
     * @param responsePhrase  A textual representation of responseCode.
     *                        If absent, a standard phrase mathcing responseCode is used.
     */
    void fulfillRequest(String requestId, Integer responseCode, List<HeaderEntry> responseHeaders,
                        @Optional String body, @Optional String responsePhrase);

    /**
     * Continues the request, optionally modifying some of its parameters.
     *
     * @param requestId An id the client received in requestPaused event.
     * @param url       If set, the request url will be modified in a way that's not observable by page.
     * @param method    If set, the request method is overridden.
     * @param postData  If set, overrides the post data in the request.
     * @param headers   If set, overrides the request headrts.
     */
    void continueRequest(String requestId, @Optional String url, @Optional String method,
                         @Optional String postData, @Optional List<HeaderEntry> headers);

    /**
     * Continues a request supplying authChallengeResponse following authRequired event.
     *
     * @param requestId             An id the client received in authRequired event.
     * @param authChallengeResponse Response to  with an authChallenge.
     */
    void continueWithAuth(String requestId, AuthChallengeResponse authChallengeResponse);

    /**
     * Causes the body of the response to be received from the server and
     * returned as a single string. May only be issued for a request that
     * is paused in the Response stage and is mutually exclusive with
     * takeResponseBodyForInterceptionAsStream. Calling other methods that
     * affect the request or disabling fetch domain before body is received
     * results in an undefined behavior.
     *
     * @param requestId Identifier for the intercepted request to get body for.
     * @return GetResponseBodyResult
     */
    GetResponseBodyResult getResponseBody(String requestId);

    /**
     * Returns a handle to the stream representing the response body.
     * The request must be paused in the HeadersReceived stage.
     * Note that after this command the request can't be continued
     * as is -- client either needs to cancel it or to provide the
     * response body.
     * The stream only supports sequential read, IO.read will fail if the position
     * is specified.
     * This method is mutually exclusive with getResponseBody.
     * Calling other methods that affect the request or disabling fetch
     * domain before body is received results in an undefined behavior.
     */
    @Returns("stream")
    String takeResponseBodyAsStream(String requestId);

    /**
     * Enables issuing of requestPaused events. A request will be paused until client
     * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
     */
    void enable();

    /**
     * Provides response to the request.
     *
     * @param requestId       An id the client received in requestPaused event.
     * @param responseCode    An HTTP response code.
     * @param responseHeaders Response headers.
     */
    void fulfillRequest(String requestId, Integer responseCode, List<HeaderEntry> responseHeaders);

    /**
     * Continues the request, optionally modifying some of its parameters.
     *
     * @param requestId An id the client received in requestPaused event.
     */
    void continueRequest(String requestId);
}
