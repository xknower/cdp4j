package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum PortraitType {
    @SerializedName("portraitPrimary")
    PortraitPrimary("portraitPrimary"),

    @SerializedName("portraitSecondary")
    PortraitSecondary("portraitSecondary"),

    @SerializedName("landscapePrimary")
    LandscapePrimary("landscapePrimary"),

    @SerializedName("landscapeSecondary")
    LandscapeSecondary("landscapeSecondary");

    public final String value;

    PortraitType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
