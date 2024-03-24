package io.webfolder.cdp.type.accessibility;

import com.google.gson.annotations.SerializedName;

/**
 * Enum of possible native property sources (as a subtype of a particular AXValueSourceType)
 */
public enum AXValueNativeSourceType {
    @SerializedName("figcaption")
    Figcaption("figcaption"),

    @SerializedName("label")
    Label("label"),

    @SerializedName("labelfor")
    Labelfor("labelfor"),

    @SerializedName("labelwrapped")
    Labelwrapped("labelwrapped"),

    @SerializedName("legend")
    Legend("legend"),

    @SerializedName("tablecaption")
    Tablecaption("tablecaption"),

    @SerializedName("title")
    Title("title"),

    @SerializedName("other")
    Other("other");

    public final String value;

    AXValueNativeSourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
