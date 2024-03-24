package io.webfolder.cdp.logger;

/**
 * 控制台日志
 */
public class CdpConsoleLogger implements CdpLogger {

    private final CdpLogLevel level;

    public CdpConsoleLogger() {
        this(CdpLogLevel.Info);
    }

    public CdpConsoleLogger(final CdpLogLevel level) {
        this.level = level;
    }

    @Override
    public void debug(String message, Object... args) {
        if (CdpLogLevel.Debug.equals(level)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            System.out.println("[DEBUG] " + tuple.getMessage());
        }
    }

    @Override
    public void info(String message, Object... args) {
        if (CdpLogLevel.Info.equals(level) || CdpLogLevel.Debug.equals(level)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            System.out.println("[INFO] " + tuple.getMessage());
        }
    }

    @Override
    public void warn(String message, Object... args) {
        if (CdpLogLevel.Info.equals(level) || CdpLogLevel.Warn.equals(level) || CdpLogLevel.Debug.equals(level)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            System.out.println("[WARN] " + tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Object... args) {
        if (CdpLogLevel.Info.equals(level) || CdpLogLevel.Warn.equals(level) || CdpLogLevel.Error.equals(level) || CdpLogLevel.Debug.equals(level)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            System.out.println("[ERROR] " + tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Throwable t) {
        if (CdpLogLevel.Info.equals(level) || CdpLogLevel.Warn.equals(level) || CdpLogLevel.Error.equals(level) || CdpLogLevel.Debug.equals(level)) {

            System.err.println("[ERROR] " + message);
            if (t != null) {
                t.printStackTrace();
            }
        }
    }

}
