package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.type.constant.ObjectSubtypeHint;
import io.webfolder.cdp.type.constant.ObjectType;
import lombok.Data;

/**
 * Mirror object referencing original JavaScript object
 */
@Data
public class RemoteObject {

    /**
     * Object type.
     */
    private ObjectType type;
    /**
     * Object subtype hint. Specified for <code>object</code> type values only.
     */
    private ObjectSubtypeHint subtype;
    /**
     * Object class (constructor) name. Specified for <code>object</code> type values only.
     */
    private String className;
    /**
     * Remote object value in case of primitive values or JSON values (if it was requested).
     */
    private Object value;
    /**
     * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets this
     * property.
     */
    private String unserializableValue;
    /**
     * String representation of the object.
     */
    private String description;
    /**
     * Unique object identifier (for non-primitive values).
     */
    private String objectId;
    /**
     * Preview containing abbreviated property values. Specified for <code>object</code> type values only.
     */
    private ObjectPreview preview;

    private CustomPreview customPreview;

}
