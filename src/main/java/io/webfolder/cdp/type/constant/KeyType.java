package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum KeyType {

    @SerializedName("number")
    Number("number"),

    @SerializedName("string")
    String("string"),

    @SerializedName("date")
    Date("date"),

    @SerializedName("array")
    Array("array");

    public final String value;

    KeyType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
