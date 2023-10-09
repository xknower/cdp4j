package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.dom.Rect;
import io.webfolder.cdp.type.layertree.PictureTile;

import java.util.List;

@Experimental
@Domain("LayerTree")
public interface LayerTree {
    /**
     * Provides the reasons why the given layer was composited.
     *
     * @param layerId The id of the layer for which we want to get the reasons it was composited.
     * @return A list of strings specifying reasons for the given layer to become composited.
     */
    @Returns("compositingReasons")
    List<String> compositingReasons(String layerId);

    /**
     * Disables compositing tree inspection.
     */
    void disable();

    /**
     * Enables compositing tree inspection.
     */
    void enable();

    /**
     * Returns the snapshot identifier.
     *
     * @param tiles An array of tiles composing the snapshot.
     * @return The id of the snapshot.
     */
    @Returns("snapshotId")
    String loadSnapshot(List<PictureTile> tiles);

    /**
     * Returns the layer snapshot identifier.
     *
     * @param layerId The id of the layer.
     * @return The id of the layer snapshot.
     */
    @Returns("snapshotId")
    String makeSnapshot(String layerId);

    @Returns("timings")
    List<Double> profileSnapshot(String snapshotId, @Optional Integer minRepeatCount,
                                 @Optional Double minDuration, @Optional Rect clipRect);

    /**
     * Releases layer snapshot captured by the back-end.
     *
     * @param snapshotId The id of the layer snapshot.
     */
    void releaseSnapshot(String snapshotId);

    /**
     * Replays the layer snapshot and returns the resulting bitmap.
     *
     * @param snapshotId The id of the layer snapshot.
     * @param fromStep   The first step to replay from (replay from the very start if not specified).
     * @param toStep     The last step to replay to (replay till the end if not specified).
     * @param scale      The scale to apply while replaying (defaults to 1).
     * @return A data: URL for resulting image.
     */
    @Returns("dataURL")
    String replaySnapshot(String snapshotId, @Optional Integer fromStep, @Optional Integer toStep,
                          @Optional Double scale);

    @Returns("timings")
    List<Double> profileSnapshot(String snapshotId);

    /**
     * Replays the layer snapshot and returns the resulting bitmap.
     *
     * @param snapshotId The id of the layer snapshot.
     * @return A data: URL for resulting image.
     */
    @Returns("dataURL")
    String replaySnapshot(String snapshotId);
}
