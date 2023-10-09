package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;

@Experimental
public class EntryPreview {
    private ObjectPreview key;

    private ObjectPreview value;

    /**
     * Preview of the key. Specified for map-like collection entries.
     */
    public ObjectPreview getKey() {
        return key;
    }

    /**
     * Preview of the key. Specified for map-like collection entries.
     */
    public void setKey(ObjectPreview key) {
        this.key = key;
    }

    /**
     * Preview of the value.
     */
    public ObjectPreview getValue() {
        return value;
    }

    /**
     * Preview of the value.
     */
    public void setValue(ObjectPreview value) {
        this.value = value;
    }
}
