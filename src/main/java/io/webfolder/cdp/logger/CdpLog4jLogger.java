package io.webfolder.cdp.logger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Log4j日志，对接 Log4j 日志记录框架
 */
public class CdpLog4jLogger implements CdpLogger {

    private final Logger logger;

    public CdpLog4jLogger(final String name) {
        logger = Logger.getLogger(name);
    }

    @Override
    public void debug(String message, Object... args) {
        if (logger.isDebugEnabled()) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            logger.debug(tuple.getMessage());
        }
    }

    @Override
    public void info(String message, Object... args) {
        if (logger.isInfoEnabled()) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            logger.info(tuple.getMessage());
        }
    }

    @Override
    public void warn(String message, Object... args) {
        if (logger.isEnabledFor(Level.WARN)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            logger.log(Level.WARN, tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Object... args) {
        if (logger.isEnabledFor(Level.ERROR)) {
            FormattingTuple tuple = MessageFormatter.arrayFormat(message, args);

            logger.error(tuple.getMessage());
        }
    }

    @Override
    public void error(String message, Throwable t) {
        if (logger.isEnabledFor(Level.ERROR)) {
            logger.error(message, t);
        }
    }

}
