package io.webfolder.cdp;

//import static java.lang.ProcessHandle.of; // TODO java8 compile fail, is since jdk9

//import java.lang.ProcessHandle.Info;

import java.time.Instant;

public class DefaultProcessManager extends ProcessManager {

    protected long pid;

    protected Instant startTime;

    protected String command;

    @Override
    void setProcess(CdpProcess process) {
//        ProcessHandle handle = process.getProcess().toHandle();
//        Info info = handle.info();
//        startTime = info.startInstant().get();
//        command = info.command().get();
//        pid = handle.pid();
    }

    @Override
    public boolean kill() {
//        Optional<ProcessHandle> process = of(pid);
//        if (process.isPresent()) {
//            ProcessHandle handle = process.get();
//            Info info = handle.info();
//            if (handle.isAlive() &&
//                    info.startInstant().isPresent() &&
//                    info.startInstant().get().equals(startTime) &&
//                    info.command().isPresent() &&
//                    info.command().get().equals(command)) {
//                try (Stream<ProcessHandle> descendants = handle.descendants()) {
//                    descendants.forEach(ph -> {
//                        try {
//                            if (ph.isAlive()) {
//                                ph.destroyForcibly();
//                            }
//                        } catch (Exception ignored) {
//
//                        }
//                    });
//                }
//                return handle.destroyForcibly();
//            }
//        }
        return false;
    }
}
