package io.webfolder.cdp.type.profiler;

import lombok.Data;

/**
 * Specifies a number of samples attributed to a certain source position
 */
@Data
public class PositionTickInfo {

    /**
     * Source line number (1-based).
     */
    private Integer line;
    /**
     * Number of samples attributed to the source line.
     */
    private Integer ticks;

}
