package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;

import java.io.IOException;
import java.lang.reflect.Field;

import static java.lang.String.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;

public class TaskKillProcessManager extends ProcessManager {

    private CdpProcess process;

    @Override
    void setProcess(CdpProcess process) {
        this.process = process;
    }

    @Override
    public boolean kill() {
        Field handleField;
        try {
            handleField = process.getProcess().getClass().getDeclaredField("handle");
        } catch (NoSuchFieldException | SecurityException e) {
            throw new CdpException(e);
        }
        handleField.setAccessible(true);
        Object pid;
        try {
            pid = handleField.get(process.getProcess());
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new CdpException(e);
        }
        try {
            Process process = Runtime
                    .getRuntime()
                    .exec(new String[]{
                            "cmd", "/c",
                            "taskkill",
                            "/pid",
                            valueOf(pid), "/T", "/F"
                    });
            return process.waitFor(10, SECONDS) && process.exitValue() == 0;
        } catch (IOException | InterruptedException e) {
            throw new CdpException(e);
        }
    }
}
