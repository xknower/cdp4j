package io.webfolder.cdp.type.security;

import com.google.gson.annotations.SerializedName;

/**
 * The action to take when a certificate error occurs
 * continue will continue processing the
 * request and cancel will cancel the request
 */
public enum CertificateErrorAction {
    @SerializedName("continue")
    Continue("continue"),

    @SerializedName("cancel")
    Cancel("cancel");

    public final String value;

    CertificateErrorAction(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
