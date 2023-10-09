package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Default font sizes
 */
@Experimental
public class FontSizes {
    private Integer standard;

    private Integer fixed;

    /**
     * Default standard font size.
     */
    public Integer getStandard() {
        return standard;
    }

    /**
     * Default standard font size.
     */
    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    /**
     * Default fixed font size.
     */
    public Integer getFixed() {
        return fixed;
    }

    /**
     * Default fixed font size.
     */
    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }
}
