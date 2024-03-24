package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum MouseButtonType {

    @SerializedName("none")
    None("none"),

    @SerializedName("left")
    Left("left"),

    @SerializedName("middle")
    Middle("middle"),

    @SerializedName("right")
    Right("right");

    public final String value;

    MouseButtonType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
