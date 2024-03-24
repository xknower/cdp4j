package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.ObjectSubtypeHint;
import io.webfolder.cdp.type.constant.PropertyPreviewType;
import lombok.Data;

@Experimental
@Data
public class PropertyPreview {

    /**
     * Property name.
     */
    private String name;
    /**
     * Object type. Accessor means that the property itself is an accessor property.
     */
    private PropertyPreviewType type;
    /**
     * User-friendly property value string.
     */
    private String value;
    /**
     * Nested value preview.
     */
    private ObjectPreview valuePreview;
    /**
     * Object subtype hint. Specified for <code>object</code> type values only.
     */
    private ObjectSubtypeHint subtype;

}
