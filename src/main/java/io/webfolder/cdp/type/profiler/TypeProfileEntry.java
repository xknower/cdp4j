package io.webfolder.cdp.type.profiler;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Source offset and types for a parameter or return value
 */
@Experimental
public class TypeProfileEntry {
    private Integer offset;

    private List<TypeObject> types = new ArrayList<>();

    /**
     * Source offset of the parameter or end of function for return values.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Source offset of the parameter or end of function for return values.
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * The types for this parameter or return value.
     */
    public List<TypeObject> getTypes() {
        return types;
    }

    /**
     * The types for this parameter or return value.
     */
    public void setTypes(List<TypeObject> types) {
        this.types = types;
    }
}
