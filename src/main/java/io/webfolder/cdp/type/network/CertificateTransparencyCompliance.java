package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Whether the request complied with Certificate Transparency policy
 */
public enum CertificateTransparencyCompliance {

    @SerializedName("unknown")
    Unknown("unknown"),

    @SerializedName("not-compliant")
    NotCompliant("not-compliant"),

    @SerializedName("compliant")
    Compliant("compliant");

    public final String value;

    CertificateTransparencyCompliance(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
