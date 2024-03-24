package io.webfolder.cdp.type.profiler;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Coverage data for a JavaScript function
 */
@Data
public class FunctionCoverage {

    /**
     * JavaScript function name.
     */
    private String functionName;
    /**
     * Source ranges inside the function with coverage data.
     */
    private List<CoverageRange> ranges = new ArrayList<>();
    /**
     * Whether coverage data for this function has block granularity.
     */
    private Boolean isBlockCoverage;

}
