package io.webfolder.cdp.type.memory;

import com.google.gson.annotations.SerializedName;

/**
 * Memory pressure level
 */
public enum PressureLevel {

    @SerializedName("moderate")
    Moderate("moderate"),

    @SerializedName("critical")
    Critical("critical");

    public final String value;

    PressureLevel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
