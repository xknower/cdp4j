package io.webfolder.cdp.type.profiler;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Describes a type collected during runtime
 */
@Experimental
public class TypeObject {
    private String name;

    /**
     * Name of a type collected with type profiling.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of a type collected with type profiling.
     */
    public void setName(String name) {
        this.name = name;
    }
}
