package io.webfolder.cdp.type.cachestorage;

import java.util.ArrayList;
import java.util.List;

/**
 * Data entry
 */
public class DataEntry {
    private String requestURL;

    private String requestMethod;

    private List<Header> requestHeaders = new ArrayList<>();

    private Double responseTime;

    private Integer responseStatus;

    private String responseStatusText;

    private CachedResponseType responseType;

    private List<Header> responseHeaders = new ArrayList<>();

    /**
     * Request URL.
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * Request URL.
     */
    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    /**
     * Request method.
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * Request method.
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * Request headers
     */
    public List<Header> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * Request headers
     */
    public void setRequestHeaders(List<Header> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * Number of seconds since epoch.
     */
    public Double getResponseTime() {
        return responseTime;
    }

    /**
     * Number of seconds since epoch.
     */
    public void setResponseTime(Double responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * HTTP response status code.
     */
    public Integer getResponseStatus() {
        return responseStatus;
    }

    /**
     * HTTP response status code.
     */
    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * HTTP response status text.
     */
    public String getResponseStatusText() {
        return responseStatusText;
    }

    /**
     * HTTP response status text.
     */
    public void setResponseStatusText(String responseStatusText) {
        this.responseStatusText = responseStatusText;
    }

    /**
     * HTTP response type
     */
    public CachedResponseType getResponseType() {
        return responseType;
    }

    /**
     * HTTP response type
     */
    public void setResponseType(CachedResponseType responseType) {
        this.responseType = responseType;
    }

    /**
     * Response headers
     */
    public List<Header> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Response headers
     */
    public void setResponseHeaders(List<Header> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }
}
