package io.webfolder.cdp;

import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.logger.CdpLoggerType;
import io.webfolder.cdp.session.SessionFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static io.webfolder.cdp.session.SessionFactory.DEFAULT_HOST;
import static java.lang.Long.toHexString;
import static java.lang.Runtime.getRuntime;
import static java.lang.String.format;
import static java.lang.System.getProperty;
import static java.nio.file.Paths.get;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Locale.ENGLISH;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * 本地启动器
 */
public class Launcher extends AbstractLauncher {

    private static final String OS = getProperty("os.name").toLowerCase(ENGLISH);

    private static final boolean WINDOWS = OS.startsWith("windows");

    private static final boolean OSX = OS.startsWith("mac");

    private ProcessManager processManager = new AdaptiveProcessManager();

    public Launcher(CdpLoggerType loggerType) {
        this(new SessionFactory(loggerType));
    }

    public Launcher() {
        this(new SessionFactory());
    }

    public Launcher(int port) {
        this(new SessionFactory(port));
    }

    public Launcher(final SessionFactory factory) {
        super(factory);
    }

    private String getCustomChromeBinary() {
        String chromeBinary = getProperty("chrome_binary");
        if (chromeBinary != null) {
            File chromeExecutable = new File(chromeBinary);
            if (chromeExecutable.exists() && chromeExecutable.canExecute()) {
                return chromeExecutable.getAbsolutePath();
            }
        }
        return null;
    }

    @Override
    public String findChrome() {
        String chromeExecutablePath = null;
        chromeExecutablePath = getCustomChromeBinary();
        if (chromeExecutablePath == null && WINDOWS) {
            chromeExecutablePath = findChromeWinPath();
        }
        if (chromeExecutablePath == null && OSX) {
            chromeExecutablePath = findChromeOsxPath();
        }
        if (chromeExecutablePath == null && !WINDOWS) {
            chromeExecutablePath = "google-chrome";
        }
        return chromeExecutablePath;
    }

    public String findChromeWinPath() {
        try {
            for (String path : getChromeWinPaths()) {
                final Process process = getRuntime().exec(new String[]{
                        "cmd", "/c", "echo", path
                });
                final int exitCode = process.waitFor();
                if (exitCode == 0) {
                    try (InputStream is = process.getInputStream()) {
                        String location = toString(is).trim().replace("\"", "");
                        File chrome = new File(location);
                        if (chrome.exists() && chrome.canExecute()) {
                            return chrome.toString();
                        }
                    }
                }
            }
            throw new CdpException("Unable to find chrome.exe");
        } catch (Throwable e) {
            // ignore
        }
        return null;
    }

    /**
     * Tests whether chrome/chromium is installed.
     *
     * @return {@code true} if browser is found on predefined paths
     */
    public boolean isChromeInstalled() {
        String path = null;
        try {
            path = findChrome();
        } catch (CdpException e) {
            if ("Unable to find chrome.exe".equals(e.getMessage())) {
                // ignore
            } else {
                throw e;
            }
        }
        return path != null ? true : false;
    }

    protected List<String> getChromeWinPaths() {
        List<String> prefixes = asList("%localappdata%",
                "%programfiles%",
                "%programfiles(x86)%");
        List<String> suffixes = asList(
                "\\Google\\Chrome SxS\\Application\\chrome.exe",
                "\\Google\\Chrome\\Application\\chrome.exe");
        List<String> installations = new ArrayList<String>(prefixes.size() * suffixes.size());
        for (String prefix : prefixes) {
            for (String suffix : suffixes) {
                installations.add(prefix + suffix);
            }
        }
        return installations;
    }

    public String findChromeOsxPath() {
        for (String path : getChromeOsxPaths()) {
            final File chrome = new File(path);
            if (chrome.exists() && chrome.canExecute()) {
                return chrome.toString();
            }
        }
        return null;
    }

    protected List<String> getChromeOsxPaths() {
        return asList(
                "/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary", // Chrome Canary
                "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"                // Chrome Stable
        );
    }

    public SessionFactory launch(Path chromeExecutablePath, List<String> arguments) {
        return launch(chromeExecutablePath.toString(), arguments);
    }

    public SessionFactory launch(Path chromeExecutablePath) {
        return launch(chromeExecutablePath, emptyList());
    }

    /**
     * 本地启动业务流程
     *
     * @param list      启动参数全量参数
     * @param arguments 传入参数
     */
    @Override
    protected void internalLaunch(List<String> list, List<String> arguments) {
        boolean foundUserDataDir = arguments.stream().anyMatch(arg -> arg.startsWith("--user-data-dir="));

        if (!foundUserDataDir) {
            Path remoteProfileData = get(getProperty("java.io.tmpdir")).resolve("remote-profile");
            list.add(format("--user-data-dir=%s", remoteProfileData.toString()));
        }

        if (!DEFAULT_HOST.equals(factory.getHost())) {
            list.add(format("--remote-debugging-address=%s", factory.getHost()));
        }

        // 拉起 chrome 进程
        try {
            String cdp4jId = toHexString(current().nextLong());
            list.add("--cdp4jId=" + cdp4jId);
            ProcessBuilder builder = new ProcessBuilder(list);
            builder.environment().put("CDP4J_ID", cdp4jId);
            Process process = builder.start();
            // chrome.exe --remote-debugging-port=9222 --user-data-dir=C:UsersxknowerAppDataLocalTemp\emote-profile --cdp4jId=7acc4bb5778e8234
            // --disable-features=TranslateUI --disable-extensions --disable-background-networking --safebrowsing-disable-auto-update --disable-sync --metrics-recording-only --disable-default-apps --mute-audio --no-first-run --no-default-browser-check --disable-plugin-power-saver --disable-popup-blocking
            process.getOutputStream().close();
            process.getInputStream().close();
            process.getErrorStream().close();

            if (!process.isAlive()) {
                throw new CdpException("No process: the chrome process is not alive.");
            }

            processManager.setProcess(new CdpProcess(process, cdp4jId));
        } catch (IOException e) {
            throw new CdpException(e);
        }
    }

    protected String toString(InputStream is) {
        try (Scanner scanner = new Scanner(is)) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }

    public void setProcessManager(ProcessManager processManager) {
        this.processManager = processManager;
    }

    public ProcessManager getProcessManager() {
        return processManager;
    }

    @Override
    public void kill() {
        getProcessManager().kill();
    }
}
