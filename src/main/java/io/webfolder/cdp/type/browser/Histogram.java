package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Chrome histogram
 */
@Experimental
@Data
public class Histogram {

    /**
     * Name.
     */
    private String name;
    /**
     * Sum of sample values.
     */
    private Integer sum;
    /**
     * Total number of samples.
     */
    private Integer count;
    /**
     * Buckets.
     */
    private List<Bucket> buckets = new ArrayList<>();

}
