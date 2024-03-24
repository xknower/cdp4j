package io.webfolder.cdp.type.browser;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Chrome histogram bucket
 */
@Experimental
@Data
public class Bucket {

    /**
     * Minimum value (inclusive).
     */
    private Integer low;
    /**
     * Maximum value (exclusive).
     */
    private Integer high;
    /**
     * Number of samples.
     */
    private Integer count;

}
