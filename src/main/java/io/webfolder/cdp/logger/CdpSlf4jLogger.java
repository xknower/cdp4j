package io.webfolder.cdp.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j日志，对接 Slf4j 日志记录框架
 */
public class CdpSlf4jLogger implements CdpLogger {

    private final Logger log;

    public CdpSlf4jLogger(final String name) {
        log = LoggerFactory.getLogger(name);
    }

    @Override
    public void info(final String message, final Object... args) {
        if (log.isInfoEnabled()) {
            log.info(message, args);
        }
    }

    @Override
    public void debug(final String message, final Object... args) {
        if (log.isDebugEnabled()) {
            log.debug(message, args);
        }
    }

    @Override
    public void error(final String message, final Object... args) {
        if (log.isErrorEnabled()) {
            log.error(message, args);
        }
    }

    @Override
    public void warn(final String message, final Object... args) {
        if (log.isWarnEnabled()) {
            log.warn(message, args);
        }
    }

    @Override
    public void error(String message, Throwable t) {
        if (log.isErrorEnabled()) {
            log.error(message, t);
        }
    }
}
