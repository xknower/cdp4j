package io.webfolder.cdp.logger;

/**
 * 日志工厂，根据配置初始化日志记录实例
 */
public interface LoggerFactory {

    /**
     * 初始化日志记录实例
     *
     * @param name 日志名
     * @return CdpLogger
     */
    CdpLogger getLogger(String name);

}
