package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Default font sizes
 */
@Experimental
@Data
public class FontSizes {

    /**
     * Default standard font size.
     */
    private Integer standard;
    /**
     * Default fixed font size.
     */
    private Integer fixed;

}
