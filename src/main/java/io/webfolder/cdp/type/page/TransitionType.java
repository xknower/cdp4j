package io.webfolder.cdp.type.page;

import com.google.gson.annotations.SerializedName;

/**
 * Transition type
 */
public enum TransitionType {

    @SerializedName("link")
    Link("link"),

    @SerializedName("typed")
    Typed("typed"),

    @SerializedName("address_bar")
    AddressBar("address_bar"),

    @SerializedName("auto_bookmark")
    AutoBookmark("auto_bookmark"),

    @SerializedName("auto_subframe")
    AutoSubframe("auto_subframe"),

    @SerializedName("manual_subframe")
    ManualSubframe("manual_subframe"),

    @SerializedName("generated")
    Generated("generated"),

    @SerializedName("auto_toplevel")
    AutoToplevel("auto_toplevel"),

    @SerializedName("form_submit")
    FormSubmit("form_submit"),

    @SerializedName("reload")
    Reload("reload"),

    @SerializedName("keyword")
    Keyword("keyword"),

    @SerializedName("keyword_generated")
    KeywordGenerated("keyword_generated"),

    @SerializedName("other")
    Other("other");

    public final String value;

    TransitionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
