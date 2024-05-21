package io.webfolder.cdp;

public class CdpProcess {

    private final Process process;

    private final String cdp4jProcessId;

    public CdpProcess(Process process, String cdp4jProcessId) {
        this.process = process;
        this.cdp4jProcessId = cdp4jProcessId;
    }

    public Process getProcess() {
        return process;
    }

    public String getCdp4jProcessId() {
        return cdp4jProcessId;
    }

}
