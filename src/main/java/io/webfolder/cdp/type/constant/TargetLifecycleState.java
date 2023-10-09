package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TargetLifecycleState {
    @SerializedName("frozen")
    Frozen("frozen"),

    @SerializedName("active")
    Active("active");

    public final String value;

    TargetLifecycleState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
