package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum AuthChallengeSource {
    @SerializedName("Server")
    Server("Server"),

    @SerializedName("Proxy")
    Proxy("Proxy");

    public final String value;

    AuthChallengeSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
