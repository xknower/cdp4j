package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.ResourceType;

/**
 * Information about the Resource on the page
 */
@Experimental
public class FrameResource {
    private String url;

    private ResourceType type;

    private String mimeType;

    private Double lastModified;

    private Double contentSize;

    private Boolean failed;

    private Boolean canceled;

    /**
     * Resource URL.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Resource URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Type of this resource.
     */
    public ResourceType getType() {
        return type;
    }

    /**
     * Type of this resource.
     */
    public void setType(ResourceType type) {
        this.type = type;
    }

    /**
     * Resource mimeType as determined by the browser.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Resource mimeType as determined by the browser.
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * last-modified timestamp as reported by server.
     */
    public Double getLastModified() {
        return lastModified;
    }

    /**
     * last-modified timestamp as reported by server.
     */
    public void setLastModified(Double lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Resource content size.
     */
    public Double getContentSize() {
        return contentSize;
    }

    /**
     * Resource content size.
     */
    public void setContentSize(Double contentSize) {
        this.contentSize = contentSize;
    }

    /**
     * True if the resource failed to load.
     */
    public Boolean isFailed() {
        return failed;
    }

    /**
     * True if the resource failed to load.
     */
    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    /**
     * True if the resource was canceled during loading.
     */
    public Boolean isCanceled() {
        return canceled;
    }

    /**
     * True if the resource was canceled during loading.
     */
    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }
}
