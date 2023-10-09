package io.webfolder.cdp.type.css;

public class ShorthandEntry {
    private String name;

    private String value;

    private Boolean important;

    /**
     * Shorthand name.
     */
    public String getName() {
        return name;
    }

    /**
     * Shorthand name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Shorthand value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Shorthand value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Whether the property has "!important" annotation (implies <code>false</code> if absent).
     */
    public Boolean isImportant() {
        return important;
    }

    /**
     * Whether the property has "!important" annotation (implies <code>false</code> if absent).
     */
    public void setImportant(Boolean important) {
        this.important = important;
    }
}
