package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ReferrerPolicy {

    @SerializedName("unsafe-url")
    UnsafeUrl("unsafe-url"),

    @SerializedName("no-referrer-when-downgrade")
    NoReferrerWhenDowngrade("no-referrer-when-downgrade"),

    @SerializedName("no-referrer")
    NoReferrer("no-referrer"),

    @SerializedName("origin")
    Origin("origin"),

    @SerializedName("origin-when-cross-origin")
    OriginWhenCrossOrigin("origin-when-cross-origin"),

    @SerializedName("same-origin")
    SameOrigin("same-origin"),

    @SerializedName("strict-origin")
    StrictOrigin("strict-origin"),

    @SerializedName("strict-origin-when-cross-origin")
    StrictOriginWhenCrossOrigin("strict-origin-when-cross-origin");

    public final String value;

    ReferrerPolicy(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
