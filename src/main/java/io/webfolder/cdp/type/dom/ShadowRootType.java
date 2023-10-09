package io.webfolder.cdp.type.dom;

import com.google.gson.annotations.SerializedName;

/**
 * Shadow root type
 */
public enum ShadowRootType {
    @SerializedName("user-agent")
    UserAgent("user-agent"),

    @SerializedName("open")
    Open("open"),

    @SerializedName("closed")
    Closed("closed");

    public final String value;

    ShadowRootType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
