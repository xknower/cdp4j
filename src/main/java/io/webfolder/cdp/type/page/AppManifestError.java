package io.webfolder.cdp.type.page;

import lombok.Data;

/**
 * Error while paring app manifest
 */
@Data
public class AppManifestError {

    /**
     * Error message.
     */
    private String message;
    /**
     * If critical, this is a non-recoverable parse error.
     */
    private Integer critical;
    /**
     * Error line.
     */
    private Integer line;
    /**
     * Error column.
     */
    private Integer column;

}
