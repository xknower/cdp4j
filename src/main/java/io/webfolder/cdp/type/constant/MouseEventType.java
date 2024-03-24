package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum MouseEventType {

    @SerializedName("mousePressed")
    MousePressed("mousePressed"),

    @SerializedName("mouseReleased")
    MouseReleased("mouseReleased"),

    @SerializedName("mouseMoved")
    MouseMoved("mouseMoved"),

    @SerializedName("mouseWheel")
    MouseWheel("mouseWheel");

    public final String value;

    MouseEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
