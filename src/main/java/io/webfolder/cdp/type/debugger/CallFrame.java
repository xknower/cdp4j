package io.webfolder.cdp.type.debugger;

import com.google.gson.annotations.SerializedName;
import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaScript call frame
 * Array of call frames form the call stack
 */
@Data
public class CallFrame {

    /**
     * Call frame identifier. This identifier is only valid while the virtual machine is paused.
     */
    private String callFrameId;
    /**
     * Name of the JavaScript function called on this call frame.
     */
    private String functionName;
    /**
     * Location in the source code.
     */
    private Location functionLocation;
    /**
     * Location in the source code.
     */
    private Location location;
    /**
     * JavaScript script name or url.
     */
    private String url;
    /**
     * Scope chain for this call frame.
     */
    private List<Scope> scopeChain = new ArrayList<>();
    /**
     * <code>this</code> object for this call frame.
     */
    @SerializedName("this")
    private RemoteObject that;
    /**
     * The value being returned, if the function is at return point.
     */
    private RemoteObject returnValue;

}
