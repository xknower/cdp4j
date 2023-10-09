package io.webfolder.cdp.logger;

import static io.webfolder.cdp.logger.CdpLoggerType.Console;
import static io.webfolder.cdp.logger.CdpLoggerType.Slf4j;

public class CdpLoggerFactory implements LoggerFactory {

    private final CdpLoggerType loggerType;

    private static CdpLogger NULL_LOGGER = new CdpLogger() {

        @Override
        public void info(String message, Object... args) {
        }

        @Override
        public void debug(String message, Object... args) {
        }

        @Override
        public void error(String message, Object... args) {
        }

        @Override
        public void warn(String message, Object... args) {
        }

        @Override
        public void error(String message, Throwable t) {
        }
    };

    public CdpLoggerFactory() {
        this(getDefaultLoggerType());
    }

    public CdpLoggerFactory(final CdpLoggerType loggerType) {
        this.loggerType = loggerType;
    }

    @Override
    public CdpLogger getLogger(String name) {
        try {
            switch (loggerType) {
                case Slf4j:
                    return new CdpSlf4jLogger(name);
                case Console:
                    return new CdpConsoleLogger();
                case Log4j:
                    return new CdpLog4jLogger(name);
                default:
                    return NULL_LOGGER;
            }
        } catch (Throwable e) {
            return NULL_LOGGER;
        }
    }

    public static CdpLoggerType getDefaultLoggerType() {
        CdpLoggerType cdpLoggerType = Console;
        try {
            CdpLoggerFactory.class.getClassLoader().loadClass("org.slf4j.Logger");
            cdpLoggerType = Slf4j;
        } catch (ClassNotFoundException e) {
            // ignore
        }
        return cdpLoggerType;
    }
}
