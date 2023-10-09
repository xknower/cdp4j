package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.Class.forName;
import static java.lang.String.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MacOsProcessManager extends ProcessManager {

    private int pid;

    private String cdp4jId;

    @Override
    void setProcess(CdpProcess process) {
        try {
            Field pidField = process.getProcess().getClass().getDeclaredField("pid");
            pidField.setAccessible(true);
            this.pid = (int) pidField.get(process.getProcess());
        } catch (Throwable e) {
            throw new CdpException(e);
        }
        this.cdp4jId = process.getCdp4jProcessId();
    }

    @Override
    public boolean kill() {
        ProcessBuilder builder = new ProcessBuilder("ps", "auxww");
        boolean found = false;
        try {
            Process process = builder.start();
            boolean ok = process.waitFor(5, SECONDS);
            if (!ok) {
                return false;
            }
            if (process.exitValue() != 0) {
                return false;
            }
            try (BufferedReader scanner = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line = scanner.readLine();
                String processId = "cdp4jId=" + cdp4jId;
                String strPid = " " + valueOf(pid) + " ";
                while ((line = scanner.readLine()) != null) {
                    if (line.contains(processId) && line.contains(strPid)) {
                        found = true;
                        break;
                    }
                }
            }
        } catch (Throwable e) {
            return false;
        }
        if (!found) {
            return false;
        }
        try {
            Class<?> clazz = forName("java.lang.UNIXProcess");
            Method destroyProcess = clazz.getDeclaredMethod("destroyProcess",
                    int.class,
                    boolean.class);
            destroyProcess.setAccessible(true);
            boolean force = false;
            destroyProcess.invoke(null, pid, force);
            return true;
        } catch (Throwable e) {
            return false;
        }
    }
}
