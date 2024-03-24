package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum PauseOnExceptionState {

    @SerializedName("none")
    None("none"),

    @SerializedName("uncaught")
    Uncaught("uncaught"),

    @SerializedName("all")
    All("all");

    public final String value;

    PauseOnExceptionState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
