package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum RepaintReason {

    @SerializedName("RepaintsOnScroll")
    RepaintsOnScroll("RepaintsOnScroll"),

    @SerializedName("TouchEventHandler")
    TouchEventHandler("TouchEventHandler"),

    @SerializedName("WheelEventHandler")
    WheelEventHandler("WheelEventHandler");

    public final String value;

    RepaintReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
