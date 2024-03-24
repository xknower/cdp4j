package io.webfolder.cdp.type.profiler;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Describes a type collected during runtime
 */
@Experimental
@Data
public class TypeObject {

    /**
     * Name of a type collected with type profiling.
     */
    private String name;

}
