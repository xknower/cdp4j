package io.webfolder.cdp.type.network;

import io.webfolder.cdp.type.constant.InitiatorType;
import io.webfolder.cdp.type.runtime.StackTrace;
import lombok.Data;

/**
 * Information about the request initiator
 */
@Data
public class Initiator {

    /**
     * Type of this initiator.
     */
    private InitiatorType type;
    /**
     * Initiator JavaScript stack trace, set for Script only.
     */
    private StackTrace stack;
    /**
     * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
     */
    private String url;
    /**
     * Initiator line number, set for Parser type or for Script type (when script is importing
     * module) (0-based).
     */
    private Double lineNumber;

}
