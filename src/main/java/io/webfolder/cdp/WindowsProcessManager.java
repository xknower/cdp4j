package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;
import org.jvnet.winp.WinProcess;

import java.util.TreeMap;

import static java.lang.Thread.sleep;

public class WindowsProcessManager extends ProcessManager {

    private int pid;

    private String cdp4jId;

    @Override
    void setProcess(CdpProcess process) {
        WinProcess winProcess = new WinProcess(process.getProcess());
        pid = winProcess.getPid();
        cdp4jId = getCdp4jId(winProcess, 20);
        if (cdp4jId == null || cdp4jId.trim().isEmpty()) {
            throw new CdpException("cdp4jId not found");
        }
    }

    private String getCdp4jId(WinProcess process, int retryCount) {
        String id = getCdp4jId(process);
        if (id != null) {
            return id;
        } else {
            for (int i = 0; i < retryCount; i++) {
                id = getCdp4jId(process);
                if (id != null) {
                    return id;
                } else {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new CdpException(e);
                    }
                }
            }
        }
        return id;
    }

    private String getCdp4jId(WinProcess process) {
        String cdp4jId = null;
        try {
            TreeMap<String, String> variables = process.getEnvironmentVariables();
            cdp4jId = variables.get("CDP4J_ID");
        } catch (Throwable t) {
            // ignore
        }
        if (cdp4jId != null && !cdp4jId.trim().isEmpty()) {
            return cdp4jId;
        }
        try {
            String cmd = process.getCommandLine();
            int start = cmd.indexOf("--cdp4jId=");
            if (start > 0) {
                int end = cmd.indexOf(" ", start + 1);
                if (end == -1) {
                    end = cmd.length();
                }
                cdp4jId = cmd.substring(start + "--cdp4jId=".length(), end);
            }
        } catch (Throwable t) {
            return null;
        }
        return cdp4jId;
    }

    @Override
    public boolean kill() {
        if (pid == 0 ||
                cdp4jId == null ||
                cdp4jId.trim().isEmpty()) {
            return false;
        }
        try {
            WinProcess process = new WinProcess(pid);
            if (process.isRunning()) {
                String cdp4jId = getCdp4jId(process, 20);
                if (cdp4jId == null || cdp4jId.trim().isEmpty()) {
                    throw new CdpException("cdp4jId not found");
                }
                if (pid == process.getPid() &&
                        this.cdp4jId.equals(cdp4jId)) {
                    process.killRecursively();
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Throwable t) {
            return false;
        }
        return false;
    }
}
