package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.io.ReadResult;

/**
 * Input/Output operations for streams produced by DevTools
 */
@Domain("IO")
public interface IO {
    /**
     * Close the stream, discard any temporary backing storage.
     *
     * @param handle Handle of the stream to close.
     */
    void close(String handle);

    /**
     * Read a chunk of the stream
     *
     * @param handle Handle of the stream to read.
     * @param offset Seek to the specified offset before reading (if not specificed, proceed with offset
     *               following the last read). Some types of streams may only support sequential reads.
     * @param size   Maximum number of bytes to read (left upon the agent discretion if not specified).
     * @return ReadResult
     */
    ReadResult read(String handle, @Optional Integer offset, @Optional Integer size);

    /**
     * Return UUID of Blob object specified by a remote object id.
     *
     * @param objectId Object id of a Blob object wrapper.
     * @return UUID of the specified Blob.
     */
    @Returns("uuid")
    String resolveBlob(String objectId);

    /**
     * Read a chunk of the stream
     *
     * @param handle Handle of the stream to read.
     * @return ReadResult
     */
    ReadResult read(String handle);
}
