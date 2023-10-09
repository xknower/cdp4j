package io.webfolder.cdp.logger;

import static io.webfolder.cdp.logger.CdpLogLevel.Debug;
import static io.webfolder.cdp.logger.CdpLogLevel.Error;
import static io.webfolder.cdp.logger.CdpLogLevel.Info;
import static io.webfolder.cdp.logger.CdpLogLevel.Warn;
import static io.webfolder.cdp.logger.MessageFormatter.arrayFormat;

public class CdpConsoleLogger implements CdpLogger {

    private final CdpLogLevel level;

    public CdpConsoleLogger() {
        this(Info);
    }

    public CdpConsoleLogger(final CdpLogLevel level) {
        this.level = level;
    }

    @Override
    public void info(String message, Object... args) {
        if (Info.equals(level) ||
                Debug.equals(level)) {
            FormattingTuple tuple = arrayFormat(message, args);
            System.out.println("[INFO] " + tuple.getMessage());
        }
    }

    @Override
    public void debug(String message, Object... args) {
        if (Debug.equals(level)) {
            FormattingTuple tuple = arrayFormat(message, args);
            System.out.println("[DEBUG] " + tuple.getMessage());
        }
    }

    @Override
    public void warn(String message, Object... args) {
        if (Info.equals(level) ||
                Warn.equals(level) ||
                Debug.equals(level)) {
            FormattingTuple tuple = arrayFormat(message, args);
            System.out.println("[WARN] " + tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Object... args) {
        if (Info.equals(level) ||
                Warn.equals(level) ||
                Error.equals(level) ||
                Debug.equals(level)) {
            FormattingTuple tuple = arrayFormat(message, args);
            System.out.println("[ERROR] " + tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Throwable t) {
        if (Info.equals(level) ||
                Warn.equals(level) ||
                Error.equals(level) ||
                Debug.equals(level)) {
            System.err.println("[ERROR] " + message);
            if (t != null) {
                t.printStackTrace();
            }
        }
    }
}
