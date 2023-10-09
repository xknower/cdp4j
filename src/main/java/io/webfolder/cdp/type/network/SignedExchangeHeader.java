package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Information about a signed exchange header
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#cbor-representation
 */
@Experimental
public class SignedExchangeHeader {
    private String requestUrl;

    private String requestMethod;

    private Integer responseCode;

    private Map<String, Object> responseHeaders = new HashMap<>();

    private List<SignedExchangeSignature> signatures = new ArrayList<>();

    /**
     * Signed exchange request URL.
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Signed exchange request URL.
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * Signed exchange request method.
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * Signed exchange request method.
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * Signed exchange response code.
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Signed exchange response code.
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Signed exchange response headers.
     */
    public Map<String, Object> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Signed exchange response headers.
     */
    public void setResponseHeaders(Map<String, Object> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    /**
     * Signed exchange response signature.
     */
    public List<SignedExchangeSignature> getSignatures() {
        return signatures;
    }

    /**
     * Signed exchange response signature.
     */
    public void setSignatures(List<SignedExchangeSignature> signatures) {
        this.signatures = signatures;
    }
}
