package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TargetCallFrames {

    @SerializedName("any")
    Any("any"),

    @SerializedName("current")
    Current("current");

    public final String value;

    TargetCallFrames(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
