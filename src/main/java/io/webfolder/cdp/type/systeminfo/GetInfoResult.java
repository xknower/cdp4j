package io.webfolder.cdp.type.systeminfo;

public class GetInfoResult {
    private GPUInfo gpu;

    private String modelName;

    private String modelVersion;

    private String commandLine;

    public GPUInfo getGpu() {
        return gpu;
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public String getCommandLine() {
        return commandLine;
    }
}
