package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum CSSMediaSource {
    @SerializedName("mediaRule")
    MediaRule("mediaRule"),

    @SerializedName("importRule")
    ImportRule("importRule"),

    @SerializedName("linkedSheet")
    LinkedSheet("linkedSheet"),

    @SerializedName("inlineSheet")
    InlineSheet("inlineSheet");

    public final String value;

    CSSMediaSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
