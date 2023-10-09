package io.webfolder.cdp.type.tracing;

public class RequestMemoryDumpResult {
    private String dumpGuid;

    private Boolean success;

    public String getDumpGuid() {
        return dumpGuid;
    }

    public Boolean getSuccess() {
        return success;
    }
}
