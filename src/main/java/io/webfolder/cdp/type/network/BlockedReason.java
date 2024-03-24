package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * The reason why request was blocked
 */
public enum BlockedReason {

    @SerializedName("other")
    Other("other"),

    @SerializedName("csp")
    Csp("csp"),

    @SerializedName("mixed-content")
    MixedContent("mixed-content"),

    @SerializedName("origin")
    Origin("origin"),

    @SerializedName("inspector")
    Inspector("inspector"),

    @SerializedName("subresource-filter")
    SubresourceFilter("subresource-filter"),

    @SerializedName("content-type")
    ContentType("content-type"),

    @SerializedName("collapsed-by-client")
    CollapsedByClient("collapsed-by-client");

    public final String value;

    BlockedReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
