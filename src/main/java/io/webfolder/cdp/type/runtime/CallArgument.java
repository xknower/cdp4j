package io.webfolder.cdp.type.runtime;

import lombok.Data;

/**
 * Represents function call argument
 * Either remote object id <code>objectId</code>, primitive<code>value</code>,
 * unserializable primitive value or neither of (for undefined) them should be specified
 */
@Data
public class CallArgument {

    /**
     * Primitive value or serializable javascript object.
     */
    private Object value;
    /**
     * Primitive value which can not be JSON-stringified.
     */
    private String unserializableValue;
    /**
     * Remote object handle.
     */
    private String objectId;

}
