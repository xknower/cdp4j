package io.webfolder.cdp.type.runtime;

/**
 * Object internal property descriptor
 * This property isn't normally visible in JavaScript code
 */
public class InternalPropertyDescriptor {
    private String name;

    private RemoteObject value;

    /**
     * Conventional property name.
     */
    public String getName() {
        return name;
    }

    /**
     * Conventional property name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The value associated with the property.
     */
    public RemoteObject getValue() {
        return value;
    }

    /**
     * The value associated with the property.
     */
    public void setValue(RemoteObject value) {
        this.value = value;
    }
}
