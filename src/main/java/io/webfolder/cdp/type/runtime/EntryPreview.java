package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

@Experimental
@Data
public class EntryPreview {

    /**
     * Preview of the key. Specified for map-like collection entries.
     */
    private ObjectPreview key;
    /**
     * Preview of the value.
     */
    private ObjectPreview value;

}
