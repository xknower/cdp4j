package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Chrome histogram bucket
 */
@Experimental
public class Bucket {
    private Integer low;

    private Integer high;

    private Integer count;

    /**
     * Minimum value (inclusive).
     */
    public Integer getLow() {
        return low;
    }

    /**
     * Minimum value (inclusive).
     */
    public void setLow(Integer low) {
        this.low = low;
    }

    /**
     * Maximum value (exclusive).
     */
    public Integer getHigh() {
        return high;
    }

    /**
     * Maximum value (exclusive).
     */
    public void setHigh(Integer high) {
        this.high = high;
    }

    /**
     * Number of samples.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Number of samples.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}
