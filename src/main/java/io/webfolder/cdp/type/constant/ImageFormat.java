package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ImageFormat {

    @SerializedName("jpeg")
    Jpeg("jpeg"),

    @SerializedName("png")
    Png("png");

    public final String value;

    ImageFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
