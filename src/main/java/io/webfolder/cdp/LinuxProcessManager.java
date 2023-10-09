package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.Class.forName;
import static java.util.concurrent.TimeUnit.SECONDS;

public class LinuxProcessManager extends ProcessManager {

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
        ProcessBuilder builder = new ProcessBuilder("strings",
                "-a",
                "/proc/" + pid + "/cmdline");
        try {
            Process process = builder.start();
            boolean ok = process.waitFor(5, SECONDS);
            if (!ok) {
                return false;
            }
            if (process.exitValue() != 0) {
                return false;
            }
            String stdout = toString(process.getInputStream());
            if (!stdout.contains("cdp4jId=" + cdp4jId)) {
                return false;
            }
        } catch (Throwable e) {
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

    protected String toString(InputStream is) {
        try (Scanner scanner = new Scanner(is)) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }
}
