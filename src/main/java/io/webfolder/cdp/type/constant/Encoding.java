package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum Encoding {

    @SerializedName("webp")
    Webp("webp"),

    @SerializedName("jpeg")
    Jpeg("jpeg"),

    @SerializedName("png")
    Png("png");

    public final String value;

    Encoding(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
