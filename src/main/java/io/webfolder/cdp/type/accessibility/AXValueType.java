package io.webfolder.cdp.type.accessibility;

import com.google.gson.annotations.SerializedName;

/**
 * Enum of possible property types
 */
public enum AXValueType {
    @SerializedName("boolean")
    Boolean("boolean"),

    @SerializedName("tristate")
    Tristate("tristate"),

    @SerializedName("booleanOrUndefined")
    BooleanOrUndefined("booleanOrUndefined"),

    @SerializedName("idref")
    Idref("idref"),

    @SerializedName("idrefList")
    IdrefList("idrefList"),

    @SerializedName("integer")
    Integer("integer"),

    @SerializedName("node")
    Node("node"),

    @SerializedName("nodeList")
    NodeList("nodeList"),

    @SerializedName("number")
    Number("number"),

    @SerializedName("string")
    String("string"),

    @SerializedName("computedString")
    ComputedString("computedString"),

    @SerializedName("token")
    Token("token"),

    @SerializedName("tokenList")
    TokenList("tokenList"),

    @SerializedName("domRelation")
    DomRelation("domRelation"),

    @SerializedName("role")
    Role("role"),

    @SerializedName("internalRole")
    InternalRole("internalRole"),

    @SerializedName("valueUndefined")
    ValueUndefined("valueUndefined");

    public final String value;

    AXValueType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
