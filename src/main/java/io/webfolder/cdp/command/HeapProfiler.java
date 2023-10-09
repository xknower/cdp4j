package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.heapprofiler.SamplingHeapProfile;
import io.webfolder.cdp.type.runtime.RemoteObject;

@Experimental
@Domain("HeapProfiler")
public interface HeapProfiler {
    /**
     * Enables console to refer to the node with given id via  (see Command Line API for more details
     * functions).
     *
     * @param heapObjectId Heap snapshot object id to be accessible by means of x command line API.
     */
    void addInspectedHeapObject(String heapObjectId);

    void collectGarbage();

    void disable();

    void enable();

    @Returns("heapSnapshotObjectId")
    String getHeapObjectId(String objectId);

    @Returns("result")
    RemoteObject getObjectByHeapObjectId(String objectId, @Optional String objectGroup);

    @Returns("profile")
    SamplingHeapProfile getSamplingProfile();

    void startSampling(@Optional Double samplingInterval);

    void startTrackingHeapObjects(@Optional Boolean trackAllocations);

    @Returns("profile")
    SamplingHeapProfile stopSampling();

    void stopTrackingHeapObjects(@Optional Boolean reportProgress);

    void takeHeapSnapshot(@Optional Boolean reportProgress);

    @Returns("result")
    RemoteObject getObjectByHeapObjectId(String objectId);

    void startSampling();

    void startTrackingHeapObjects();

    void stopTrackingHeapObjects();

    void takeHeapSnapshot();
}
