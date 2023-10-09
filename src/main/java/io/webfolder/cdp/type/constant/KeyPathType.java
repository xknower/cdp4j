package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum KeyPathType {
    @SerializedName("null")
    Null("null"),

    @SerializedName("string")
    String("string"),

    @SerializedName("array")
    Array("array");

    public final String value;

    KeyPathType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
