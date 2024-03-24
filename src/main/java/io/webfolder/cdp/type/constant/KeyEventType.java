package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum KeyEventType {

    @SerializedName("keyDown")
    KeyDown("keyDown"),

    @SerializedName("keyUp")
    KeyUp("keyUp"),

    @SerializedName("rawKeyDown")
    RawKeyDown("rawKeyDown"),

    @SerializedName("char")
    Char("char");

    public final String value;

    KeyEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
