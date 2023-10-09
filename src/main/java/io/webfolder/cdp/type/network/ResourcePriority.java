package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Loading priority of a resource request
 */
public enum ResourcePriority {
    @SerializedName("VeryLow")
    VeryLow("VeryLow"),

    @SerializedName("Low")
    Low("Low"),

    @SerializedName("Medium")
    Medium("Medium"),

    @SerializedName("High")
    High("High"),

    @SerializedName("VeryHigh")
    VeryHigh("VeryHigh");

    public final String value;

    ResourcePriority(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
