package io.webfolder.cdp.type.accessibility;

import com.google.gson.annotations.SerializedName;

/**
 * Enum of possible property sources
 */
public enum AXValueSourceType {
    @SerializedName("attribute")
    Attribute("attribute"),

    @SerializedName("implicit")
    Implicit("implicit"),

    @SerializedName("style")
    Style("style"),

    @SerializedName("contents")
    Contents("contents"),

    @SerializedName("placeholder")
    Placeholder("placeholder"),

    @SerializedName("relatedElement")
    RelatedElement("relatedElement");

    public final String value;

    AXValueSourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
