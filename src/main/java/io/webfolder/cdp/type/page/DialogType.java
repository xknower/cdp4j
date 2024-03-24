package io.webfolder.cdp.type.page;

import com.google.gson.annotations.SerializedName;

/**
 * Javascript dialog type
 */
public enum DialogType {

    @SerializedName("alert")
    Alert("alert"),

    @SerializedName("confirm")
    Confirm("confirm"),

    @SerializedName("prompt")
    Prompt("prompt"),

    @SerializedName("beforeunload")
    Beforeunload("beforeunload");

    public final String value;

    DialogType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
