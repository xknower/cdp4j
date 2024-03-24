package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.BlockedReason;
import io.webfolder.cdp.type.network.ResourceType;
import lombok.Data;

/**
 * Fired when HTTP request has failed to load
 */
@Domain("Network")
@EventName("loadingFailed")
@Data
public class LoadingFailed {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * Resource type.
     */
    private ResourceType type;
    /**
     * User friendly error message.
     */
    private String errorText;
    /**
     * True if loading was canceled.
     */
    private Boolean canceled;
    /**
     * The reason why loading was blocked, if any.
     */
    private BlockedReason blockedReason;

}
