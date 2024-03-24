package io.webfolder.cdp.type.overlay;

import com.google.gson.annotations.SerializedName;

public enum InspectMode {

    @SerializedName("searchForNode")
    SearchForNode("searchForNode"),

    @SerializedName("searchForUAShadowDOM")
    SearchForUAShadowDOM("searchForUAShadowDOM"),

    @SerializedName("none")
    None("none");

    public final String value;

    InspectMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
