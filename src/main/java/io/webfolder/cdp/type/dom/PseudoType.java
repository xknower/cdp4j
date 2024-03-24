package io.webfolder.cdp.type.dom;

import com.google.gson.annotations.SerializedName;

/**
 * Pseudo element type
 */
public enum PseudoType {

    @SerializedName("first-line")
    FirstLine("first-line"),

    @SerializedName("first-letter")
    FirstLetter("first-letter"),

    @SerializedName("before")
    Before("before"),

    @SerializedName("after")
    After("after"),

    @SerializedName("backdrop")
    Backdrop("backdrop"),

    @SerializedName("selection")
    Selection("selection"),

    @SerializedName("first-line-inherited")
    FirstLineInherited("first-line-inherited"),

    @SerializedName("scrollbar")
    Scrollbar("scrollbar"),

    @SerializedName("scrollbar-thumb")
    ScrollbarThumb("scrollbar-thumb"),

    @SerializedName("scrollbar-button")
    ScrollbarButton("scrollbar-button"),

    @SerializedName("scrollbar-track")
    ScrollbarTrack("scrollbar-track"),

    @SerializedName("scrollbar-track-piece")
    ScrollbarTrackPiece("scrollbar-track-piece"),

    @SerializedName("scrollbar-corner")
    ScrollbarCorner("scrollbar-corner"),

    @SerializedName("resizer")
    Resizer("resizer"),

    @SerializedName("input-list-button")
    InputListButton("input-list-button");

    public final String value;

    PseudoType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
