package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Field type for a signed exchange related error
 */
public enum SignedExchangeErrorField {

    @SerializedName("signatureSig")
    SignatureSig("signatureSig"),

    @SerializedName("signatureIntegrity")
    SignatureIntegrity("signatureIntegrity"),

    @SerializedName("signatureCertUrl")
    SignatureCertUrl("signatureCertUrl"),

    @SerializedName("signatureCertSha256")
    SignatureCertSha256("signatureCertSha256"),

    @SerializedName("signatureValidityUrl")
    SignatureValidityUrl("signatureValidityUrl"),

    @SerializedName("signatureTimestamps")
    SignatureTimestamps("signatureTimestamps");

    public final String value;

    SignedExchangeErrorField(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
