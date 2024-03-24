package io.webfolder.cdp.type.systeminfo;

import lombok.Getter;

@Getter
public class GetInfoResult {

    private GPUInfo gpu;

    private String modelName;

    private String modelVersion;

    private String commandLine;

}
