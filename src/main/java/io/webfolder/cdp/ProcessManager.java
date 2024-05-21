package io.webfolder.cdp;

public abstract class ProcessManager {

    abstract void setProcess(CdpProcess process);

    public abstract boolean kill();

}
