package io.webfolder.cdp.type.indexeddb;

import lombok.Data;

/**
 * Key range
 */
@Data
public class KeyRange {

    /**
     * Lower bound.
     */
    private Key lower;
    /**
     * Upper bound.
     */
    private Key upper;
    /**
     * If true lower bound is open.
     */
    private Boolean lowerOpen;
    /**
     * If true upper bound is open.
     */
    private Boolean upperOpen;

}
