package io.webfolder.cdp.logger;

/**
 * 日志接口
 */
public interface CdpLogger {

    void debug(String message, Object... args);

    void info(String message, Object... args);

    void warn(String message, Object... args);

    void error(String message, Object... args);

    void error(String message, Throwable t);

}
