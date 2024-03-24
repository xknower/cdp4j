package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.ObjectSubtypeHint;
import io.webfolder.cdp.type.constant.ObjectType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Object containing abbreviated remote object value
 */
@Experimental
@Data
public class ObjectPreview {

    /**
     * Object type.
     */
    private ObjectType type;
    /**
     * Object subtype hint. Specified for <code>object</code> type values only.
     */
    private ObjectSubtypeHint subtype;
    /**
     * String representation of the object.
     */
    private String description;
    /**
     * True iff some of the properties or entries of the original object did not fit.
     */
    private Boolean overflow;
    /**
     * List of the properties.
     */
    private List<PropertyPreview> properties = new ArrayList<>();
    /**
     * List of the entries. Specified for <code>map</code> and <code>set</code> subtype values only.
     */
    private List<EntryPreview> entries = new ArrayList<>();

}
