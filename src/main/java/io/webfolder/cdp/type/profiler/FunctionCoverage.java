package io.webfolder.cdp.type.profiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Coverage data for a JavaScript function
 */
public class FunctionCoverage {
    private String functionName;

    private List<CoverageRange> ranges = new ArrayList<>();

    private Boolean isBlockCoverage;

    /**
     * JavaScript function name.
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * JavaScript function name.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * Source ranges inside the function with coverage data.
     */
    public List<CoverageRange> getRanges() {
        return ranges;
    }

    /**
     * Source ranges inside the function with coverage data.
     */
    public void setRanges(List<CoverageRange> ranges) {
        this.ranges = ranges;
    }

    /**
     * Whether coverage data for this function has block granularity.
     */
    public Boolean isIsBlockCoverage() {
        return isBlockCoverage;
    }

    /**
     * Whether coverage data for this function has block granularity.
     */
    public void setIsBlockCoverage(Boolean isBlockCoverage) {
        this.isBlockCoverage = isBlockCoverage;
    }
}
