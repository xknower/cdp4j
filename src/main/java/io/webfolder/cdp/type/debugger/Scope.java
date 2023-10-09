package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.constant.ScopeType;
import io.webfolder.cdp.type.runtime.RemoteObject;

/**
 * Scope description
 */
public class Scope {
    private ScopeType type;

    private RemoteObject object;

    private String name;

    private Location startLocation;

    private Location endLocation;

    /**
     * Scope type.
     */
    public ScopeType getType() {
        return type;
    }

    /**
     * Scope type.
     */
    public void setType(ScopeType type) {
        this.type = type;
    }

    /**
     * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual
     * object; for the rest of the scopes, it is artificial transient object enumerating scope
     * variables as its properties.
     */
    public RemoteObject getObject() {
        return object;
    }

    /**
     * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual
     * object; for the rest of the scopes, it is artificial transient object enumerating scope
     * variables as its properties.
     */
    public void setObject(RemoteObject object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Location in the source code where scope starts
     */
    public Location getStartLocation() {
        return startLocation;
    }

    /**
     * Location in the source code where scope starts
     */
    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    /**
     * Location in the source code where scope ends
     */
    public Location getEndLocation() {
        return endLocation;
    }

    /**
     * Location in the source code where scope ends
     */
    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }
}
