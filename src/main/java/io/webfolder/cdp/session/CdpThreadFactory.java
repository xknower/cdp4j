package io.webfolder.cdp.session;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程工厂
 */
class CdpThreadFactory implements ThreadFactory {

    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "cdp4j-" + counter.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

}
