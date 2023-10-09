package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum Platform {
    @SerializedName("mobile")
    Mobile("mobile"),

    @SerializedName("desktop")
    Desktop("desktop");

    public final String value;

    Platform(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
