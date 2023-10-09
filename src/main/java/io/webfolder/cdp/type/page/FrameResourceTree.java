package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Information about the Frame hierarchy along with their cached resources
 */
@Experimental
public class FrameResourceTree {
    private Frame frame;

    private List<FrameResourceTree> childFrames = new ArrayList<>();

    private List<FrameResource> resources = new ArrayList<>();

    /**
     * Frame information for this tree item.
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Frame information for this tree item.
     */
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    /**
     * Child frames.
     */
    public List<FrameResourceTree> getChildFrames() {
        return childFrames;
    }

    /**
     * Child frames.
     */
    public void setChildFrames(List<FrameResourceTree> childFrames) {
        this.childFrames = childFrames;
    }

    /**
     * Information about frame resources.
     */
    public List<FrameResource> getResources() {
        return resources;
    }

    /**
     * Information about frame resources.
     */
    public void setResources(List<FrameResource> resources) {
        this.resources = resources;
    }
}
