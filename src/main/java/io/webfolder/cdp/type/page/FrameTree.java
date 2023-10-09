package io.webfolder.cdp.type.page;

import java.util.ArrayList;
import java.util.List;

/**
 * Information about the Frame hierarchy
 */
public class FrameTree {
    private Frame frame;

    private List<FrameTree> childFrames = new ArrayList<>();

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
    public List<FrameTree> getChildFrames() {
        return childFrames;
    }

    /**
     * Child frames.
     */
    public void setChildFrames(List<FrameTree> childFrames) {
        this.childFrames = childFrames;
    }
}
