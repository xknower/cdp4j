package io.webfolder.cdp.type.target;

import lombok.Data;

@Data
public class TargetInfo {

    private String targetId;

    private String type;

    private String title;

    private String url;
    /**
     * Whether the target has an attached client.
     */
    private Boolean attached;
    /**
     * Opener target Id
     */
    private String openerId;

    private String browserContextId;

}
