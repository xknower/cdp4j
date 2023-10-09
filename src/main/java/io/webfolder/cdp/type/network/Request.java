package io.webfolder.cdp.type.network;

import io.webfolder.cdp.type.constant.ReferrerPolicy;
import io.webfolder.cdp.type.security.MixedContentType;

import java.util.HashMap;
import java.util.Map;

/**
 * HTTP request data
 */
public class Request {
    private String url;

    private String urlFragment;

    private String method;

    private Map<String, Object> headers = new HashMap<>();

    private String postData;

    private Boolean hasPostData;

    private MixedContentType mixedContentType;

    private ResourcePriority initialPriority;

    private ReferrerPolicy referrerPolicy;

    private Boolean isLinkPreload;

    /**
     * Request URL (without fragment).
     */
    public String getUrl() {
        return url;
    }

    /**
     * Request URL (without fragment).
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Fragment of the requested URL starting with hash, if present.
     */
    public String getUrlFragment() {
        return urlFragment;
    }

    /**
     * Fragment of the requested URL starting with hash, if present.
     */
    public void setUrlFragment(String urlFragment) {
        this.urlFragment = urlFragment;
    }

    /**
     * HTTP request method.
     */
    public String getMethod() {
        return method;
    }

    /**
     * HTTP request method.
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * HTTP request headers.
     */
    public Map<String, Object> getHeaders() {
        return headers;
    }

    /**
     * HTTP request headers.
     */
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    /**
     * HTTP POST request data.
     */
    public String getPostData() {
        return postData;
    }

    /**
     * HTTP POST request data.
     */
    public void setPostData(String postData) {
        this.postData = postData;
    }

    /**
     * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
     */
    public Boolean isHasPostData() {
        return hasPostData;
    }

    /**
     * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
     */
    public void setHasPostData(Boolean hasPostData) {
        this.hasPostData = hasPostData;
    }

    /**
     * The mixed content type of the request.
     */
    public MixedContentType getMixedContentType() {
        return mixedContentType;
    }

    /**
     * The mixed content type of the request.
     */
    public void setMixedContentType(MixedContentType mixedContentType) {
        this.mixedContentType = mixedContentType;
    }

    /**
     * Priority of the resource request at the time request is sent.
     */
    public ResourcePriority getInitialPriority() {
        return initialPriority;
    }

    /**
     * Priority of the resource request at the time request is sent.
     */
    public void setInitialPriority(ResourcePriority initialPriority) {
        this.initialPriority = initialPriority;
    }

    /**
     * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
     */
    public ReferrerPolicy getReferrerPolicy() {
        return referrerPolicy;
    }

    /**
     * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
     */
    public void setReferrerPolicy(ReferrerPolicy referrerPolicy) {
        this.referrerPolicy = referrerPolicy;
    }

    /**
     * Whether is loaded via link preload.
     */
    public Boolean isIsLinkPreload() {
        return isLinkPreload;
    }

    /**
     * Whether is loaded via link preload.
     */
    public void setIsLinkPreload(Boolean isLinkPreload) {
        this.isLinkPreload = isLinkPreload;
    }
}
