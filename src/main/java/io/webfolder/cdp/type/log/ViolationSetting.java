package io.webfolder.cdp.type.log;

import io.webfolder.cdp.type.constant.ViolationType;

/**
 * Violation configuration setting
 */
public class ViolationSetting {
    private ViolationType name;

    private Double threshold;

    /**
     * Violation type.
     */
    public ViolationType getName() {
        return name;
    }

    /**
     * Violation type.
     */
    public void setName(ViolationType name) {
        this.name = name;
    }

    /**
     * Time threshold to trigger upon.
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * Time threshold to trigger upon.
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
}
