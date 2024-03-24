package io.webfolder.cdp.type.runtime;

import lombok.Data;

import java.util.Map;

/**
 * Description of an isolated world
 */
@Data
public class ExecutionContextDescription {

    /**
     * Unique id of the execution context. It can be used to specify in which execution context
     * script evaluation should be performed.
     */
    private Integer id;
    /**
     * Execution context origin.
     */
    private String origin;
    /**
     * Human readable name describing given context.
     */
    private String name;
    /**
     * Embedder-specific auxiliary data.
     */
    private Map<String, Object> auxData;

}
