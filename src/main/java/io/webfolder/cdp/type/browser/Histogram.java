package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Chrome histogram
 */
@Experimental
public class Histogram {
    private String name;

    private Integer sum;

    private Integer count;

    private List<Bucket> buckets = new ArrayList<>();

    /**
     * Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sum of sample values.
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * Sum of sample values.
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * Total number of samples.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Total number of samples.
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Buckets.
     */
    public List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * Buckets.
     */
    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }
}
