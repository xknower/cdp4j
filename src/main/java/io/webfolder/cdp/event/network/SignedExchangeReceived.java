package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.SignedExchangeInfo;

/**
 * Fired when a signed exchange was received over the network
 */
@Experimental
@Domain("Network")
@EventName("signedExchangeReceived")
public class SignedExchangeReceived {
    private String requestId;

    private SignedExchangeInfo info;

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
     * Information about the signed exchange response.
     */
    public SignedExchangeInfo getInfo() {
        return info;
    }

    /**
     * Information about the signed exchange response.
     */
    public void setInfo(SignedExchangeInfo info) {
        this.info = info;
    }
}
