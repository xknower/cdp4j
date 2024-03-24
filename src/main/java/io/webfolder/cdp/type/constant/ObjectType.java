package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ObjectType {

    @SerializedName("object")
    Object("object"),

    @SerializedName("function")
    Function("function"),

    @SerializedName("undefined")
    Undefined("undefined"),

    @SerializedName("string")
    String("string"),

    @SerializedName("number")
    Number("number"),

    @SerializedName("boolean")
    Boolean("boolean"),

    @SerializedName("symbol")
    Symbol("symbol"),

    @SerializedName("bigint")
    Bigint("bigint");

    public final String value;

    ObjectType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
