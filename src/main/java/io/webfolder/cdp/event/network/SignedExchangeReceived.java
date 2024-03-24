package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.network.SignedExchangeInfo;
import lombok.Data;

/**
 * Fired when a signed exchange was received over the network
 */
@Experimental
@Domain("Network")
@EventName("signedExchangeReceived")
@Data
public class SignedExchangeReceived {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Information about the signed exchange response.
     */
    private SignedExchangeInfo info;

}
