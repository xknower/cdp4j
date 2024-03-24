package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum AuthResponse {

    @SerializedName("Default")
    Default("Default"),

    @SerializedName("CancelAuth")
    CancelAuth("CancelAuth"),

    @SerializedName("ProvideCredentials")
    ProvideCredentials("ProvideCredentials");

    public final String value;

    AuthResponse(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
