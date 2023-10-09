package io.webfolder.cdp.type.accessibility;

public class AXProperty {
    private AXPropertyName name;

    private AXValue value;

    /**
     * The name of this property.
     */
    public AXPropertyName getName() {
        return name;
    }

    /**
     * The name of this property.
     */
    public void setName(AXPropertyName name) {
        this.name = name;
    }

    /**
     * The value of this property.
     */
    public AXValue getValue() {
        return value;
    }

    /**
     * The value of this property.
     */
    public void setValue(AXValue value) {
        this.value = value;
    }
}
