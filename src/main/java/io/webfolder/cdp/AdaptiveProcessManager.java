package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.logger.CdpLogger;
import io.webfolder.cdp.logger.CdpLoggerFactory;

import static java.io.File.pathSeparator;
import static java.lang.System.getProperty;
import static java.util.Locale.ENGLISH;

public class AdaptiveProcessManager extends ProcessManager {

    private ProcessManager processManager;

    private static final String OS = getProperty("os.name").toLowerCase(ENGLISH);

    private static final boolean WINDOWS = ";".equals(pathSeparator);

    private static final boolean LINUX = "linux".contains(OS);

    private static final boolean MAC = OS.contains("mac");

    private static final boolean JAVA_8 = getProperty("java.version").startsWith("1.8.");

    private CdpLogger logger = new CdpLoggerFactory().getLogger("cdp4j.process-manager");

    public AdaptiveProcessManager() {
        if (!JAVA_8) {
            processManager = new DefaultProcessManager();
        } else if (WINDOWS) {
            try {
                processManager = new WindowsProcessManager();
            } catch (Throwable t) {
                logger.error(t.getMessage());
            }
        } else if (LINUX) {
            processManager = new LinuxProcessManager();
        } else if (MAC) {
            processManager = new MacOsProcessManager();
        } else {
            throw new CdpException(OS + " is not supported by AdaptiveProcessManager");
        }
    }

    @Override
    void setProcess(CdpProcess process) {
        processManager.setProcess(process);
    }

    @Override
    public boolean kill() {
        return processManager.kill();
    }
}
