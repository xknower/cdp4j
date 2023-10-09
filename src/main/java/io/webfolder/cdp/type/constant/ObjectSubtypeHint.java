package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ObjectSubtypeHint {
    @SerializedName("array")
    Array("array"),

    @SerializedName("null")
    Null("null"),

    @SerializedName("node")
    Node("node"),

    @SerializedName("regexp")
    Regexp("regexp"),

    @SerializedName("date")
    Date("date"),

    @SerializedName("map")
    Map("map"),

    @SerializedName("set")
    Set("set"),

    @SerializedName("weakmap")
    Weakmap("weakmap"),

    @SerializedName("weakset")
    Weakset("weakset"),

    @SerializedName("iterator")
    Iterator("iterator"),

    @SerializedName("generator")
    Generator("generator"),

    @SerializedName("error")
    Error("error");

    public final String value;

    ObjectSubtypeHint(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
