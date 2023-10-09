package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ScopeType {
    @SerializedName("global")
    Global("global"),

    @SerializedName("local")
    Local("local"),

    @SerializedName("with")
    With("with"),

    @SerializedName("closure")
    Closure("closure"),

    @SerializedName("catch")
    Catch("catch"),

    @SerializedName("block")
    Block("block"),

    @SerializedName("script")
    Script("script"),

    @SerializedName("eval")
    Eval("eval"),

    @SerializedName("module")
    Module("module");

    public final String value;

    ScopeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
