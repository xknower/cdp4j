package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TouchEventType {

    @SerializedName("touchStart")
    TouchStart("touchStart"),

    @SerializedName("touchEnd")
    TouchEnd("touchEnd"),

    @SerializedName("touchMove")
    TouchMove("touchMove"),

    @SerializedName("touchCancel")
    TouchCancel("touchCancel");

    public final String value;

    TouchEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
