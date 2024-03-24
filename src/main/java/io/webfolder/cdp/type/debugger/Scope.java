package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.constant.ScopeType;
import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Data;

/**
 * Scope description
 */
@Data
public class Scope {

    /**
     * Scope type.
     */
    private ScopeType type;
    /**
     * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual
     * object; for the rest of the scopes, it is artificial transient object enumerating scope
     * variables as its properties.
     */
    private RemoteObject object;

    private String name;
    /**
     * Location in the source code where scope starts
     */
    private Location startLocation;
    /**
     * Location in the source code where scope ends
     */
    private Location endLocation;

}
