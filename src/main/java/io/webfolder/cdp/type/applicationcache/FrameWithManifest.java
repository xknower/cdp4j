package io.webfolder.cdp.type.applicationcache;

import lombok.Data;

/**
 * Frame identifier - manifest URL pair
 */
@Data
public class FrameWithManifest {

    /**
     * Frame identifier.
     */
    private String frameId;
    /**
     * Manifest URL.
     */
    private String manifestURL;
    /**
     * Application cache status.
     */
    private Integer status;

}
