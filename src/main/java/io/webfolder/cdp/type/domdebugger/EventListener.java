package io.webfolder.cdp.type.domdebugger;

import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Data;

/**
 * Object event listener
 */
@Data
public class EventListener {

    /**
     * <code>EventListener</code>'s type.
     */
    private String type;
    /**
     * <code>EventListener</code>'s useCapture.
     */
    private Boolean useCapture;
    /**
     * <code>EventListener</code>'s passive flag.
     */
    private Boolean passive;
    /**
     * <code>EventListener</code>'s once flag.
     */
    private Boolean once;
    /**
     * Script id of the handler code.
     */
    private String scriptId;
    /**
     * Line number in the script (0-based).
     */
    private Integer lineNumber;
    /**
     * Column number in the script (0-based).
     */
    private Integer columnNumber;
    /**
     * Event handler function value.
     */
    private RemoteObject handler;
    /**
     * Event original handler function value.
     */
    private RemoteObject originalHandler;
    /**
     * Node the listener is added to (if any).
     */
    private Integer backendNodeId;

}
