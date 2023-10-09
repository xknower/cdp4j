package io.webfolder.cdp.type.domdebugger;

import com.google.gson.annotations.SerializedName;

/**
 * DOM breakpoint type
 */
public enum DOMBreakpointType {
    @SerializedName("subtree-modified")
    SubtreeModified("subtree-modified"),

    @SerializedName("attribute-modified")
    AttributeModified("attribute-modified"),

    @SerializedName("node-removed")
    NodeRemoved("node-removed");

    public final String value;

    DOMBreakpointType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
