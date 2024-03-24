package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum SnapshotType {

    @SerializedName("mhtml")
    Mhtml("mhtml");

    public final String value;

    SnapshotType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
