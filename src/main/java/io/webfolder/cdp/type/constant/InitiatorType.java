package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum InitiatorType {
    @SerializedName("parser")
    Parser("parser"),

    @SerializedName("script")
    Script("script"),

    @SerializedName("preload")
    Preload("preload"),

    @SerializedName("SignedExchange")
    SignedExchange("SignedExchange"),

    @SerializedName("other")
    Other("other");

    public final String value;

    InitiatorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
