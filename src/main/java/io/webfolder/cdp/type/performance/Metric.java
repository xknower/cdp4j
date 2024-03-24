package io.webfolder.cdp.type.performance;

import lombok.Data;

/**
 * Run-time execution metric
 */
@Data
public class Metric {

    /**
     * Metric name.
     */
    private String name;
    /**
     * Metric value.
     */
    private Double value;

}
