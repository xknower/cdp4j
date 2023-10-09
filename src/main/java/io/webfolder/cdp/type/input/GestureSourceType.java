package io.webfolder.cdp.type.input;

import com.google.gson.annotations.SerializedName;

public enum GestureSourceType {
    @SerializedName("default")
    Default("default"),

    @SerializedName("touch")
    Touch("touch"),

    @SerializedName("mouse")
    Mouse("mouse");

    public final String value;

    GestureSourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
