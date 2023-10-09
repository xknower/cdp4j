package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.type.domsnapshot.CaptureSnapshotResult;
import io.webfolder.cdp.type.domsnapshot.GetSnapshotResult;

import java.util.List;

/**
 * This domain facilitates obtaining document snapshots with DOM, layout, and style information
 */
@Experimental
@Domain("DOMSnapshot")
public interface DOMSnapshot {
    /**
     * Disables DOM snapshot agent for the given page.
     */
    void disable();

    /**
     * Enables DOM snapshot agent for the given page.
     */
    void enable();

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
     * template contents, and imported documents) in a flattened array, as well as layout and
     * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
     * flattened.
     *
     * @param computedStyleWhitelist     Whitelist of computed styles to return.
     * @param includeEventListeners      Whether or not to retrieve details of DOM listeners (default false).
     * @param includePaintOrder          Whether to determine and include the paint order index of LayoutTreeNodes (default false).
     * @param includeUserAgentShadowTree Whether to include UA shadow tree in the snapshot (default false).
     * @return GetSnapshotResult
     */
    GetSnapshotResult getSnapshot(List<String> computedStyleWhitelist,
                                  @Optional Boolean includeEventListeners, @Optional Boolean includePaintOrder,
                                  @Optional Boolean includeUserAgentShadowTree);

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
     * template contents, and imported documents) in a flattened array, as well as layout and
     * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
     * flattened.
     *
     * @param computedStyles Whitelist of computed styles to return.
     * @return CaptureSnapshotResult
     */
    CaptureSnapshotResult captureSnapshot(List<String> computedStyles);

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
     * template contents, and imported documents) in a flattened array, as well as layout and
     * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
     * flattened.
     *
     * @param computedStyleWhitelist Whitelist of computed styles to return.
     * @return GetSnapshotResult
     */
    GetSnapshotResult getSnapshot(List<String> computedStyleWhitelist);
}
