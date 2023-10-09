package io.webfolder.cdp.type.indexeddb;

/**
 * Key range
 */
public class KeyRange {
    private Key lower;

    private Key upper;

    private Boolean lowerOpen;

    private Boolean upperOpen;

    /**
     * Lower bound.
     */
    public Key getLower() {
        return lower;
    }

    /**
     * Lower bound.
     */
    public void setLower(Key lower) {
        this.lower = lower;
    }

    /**
     * Upper bound.
     */
    public Key getUpper() {
        return upper;
    }

    /**
     * Upper bound.
     */
    public void setUpper(Key upper) {
        this.upper = upper;
    }

    /**
     * If true lower bound is open.
     */
    public Boolean isLowerOpen() {
        return lowerOpen;
    }

    /**
     * If true lower bound is open.
     */
    public void setLowerOpen(Boolean lowerOpen) {
        this.lowerOpen = lowerOpen;
    }

    /**
     * If true upper bound is open.
     */
    public Boolean isUpperOpen() {
        return upperOpen;
    }

    /**
     * If true upper bound is open.
     */
    public void setUpperOpen(Boolean upperOpen) {
        this.upperOpen = upperOpen;
    }
}
