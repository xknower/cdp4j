package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.BlockedReason;
import io.webfolder.cdp.type.network.ResourceType;

/**
 * Fired when HTTP request has failed to load
 */
@Domain("Network")
@EventName("loadingFailed")
public class LoadingFailed {

    /**
     * Request identifier.
     */
    private String requestId;

    private Double timestamp;

    private ResourceType type;

    private String errorText;

    private Boolean canceled;

    private BlockedReason blockedReason;

    /**
     * Request identifier.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Request identifier.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Resource type.
     */
    public ResourceType getType() {
        return type;
    }

    /**
     * Resource type.
     */
    public void setType(ResourceType type) {
        this.type = type;
    }

    /**
     * User friendly error message.
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * User friendly error message.
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    /**
     * True if loading was canceled.
     */
    public Boolean isCanceled() {
        return canceled;
    }

    /**
     * True if loading was canceled.
     */
    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    /**
     * The reason why loading was blocked, if any.
     */
    public BlockedReason getBlockedReason() {
        return blockedReason;
    }

    /**
     * The reason why loading was blocked, if any.
     */
    public void setBlockedReason(BlockedReason blockedReason) {
        this.blockedReason = blockedReason;
    }
}
