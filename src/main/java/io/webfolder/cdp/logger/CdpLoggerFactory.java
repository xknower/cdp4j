package io.webfolder.cdp.logger;

/**
 * 日志工厂，根据日志类型，创建日志记录实例
 */
public class CdpLoggerFactory implements LoggerFactory {

    private final CdpLoggerType loggerType;

    /**
     * 空日志，默认或创建异常时，使用此类型
     */
    private static final CdpLogger NULL_LOGGER = new CdpLogger() {

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

    /**
     * 加载默认日志记录类型，默认加载 Slf4j 记录日志
     */
    public static CdpLoggerType getDefaultLoggerType() {
        CdpLoggerType cdpLoggerType = CdpLoggerType.Console;
        try {
            CdpLoggerFactory.class.getClassLoader().loadClass("org.slf4j.Logger");
            cdpLoggerType = CdpLoggerType.Slf4j;
        } catch (ClassNotFoundException e) {
            // ignore
        }
        return cdpLoggerType;
    }

}
