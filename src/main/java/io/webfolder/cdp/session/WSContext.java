package io.webfolder.cdp.session;

import com.google.gson.JsonElement;
import io.webfolder.cdp.exception.CdpException;
import io.webfolder.cdp.exception.CommandException;

import java.util.concurrent.CountDownLatch;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * websocket 执行内容
 */
class WSContext {

    private final CountDownLatch latch = new CountDownLatch(1);

    private JsonElement data;

    private CommandException error;

    void await(final int timeout) {
        try {
            latch.await(timeout, MILLISECONDS);
        } catch (InterruptedException e) {
            throw new CdpException(e);
        }
    }

    void setData(final JsonElement data) {
        this.data = data;
        latch.countDown();
    }

    JsonElement getData() {
        return data;
    }

    void setError(CommandException error) {
        this.error = error;
        latch.countDown();
    }

    CommandException getError() {
        return error;
    }
}
