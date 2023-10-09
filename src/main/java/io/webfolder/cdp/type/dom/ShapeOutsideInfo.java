package io.webfolder.cdp.type.dom;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS Shape Outside details
 */
public class ShapeOutsideInfo {
    private List<Double> bounds = new ArrayList<>();

    private List<Object> shape = new ArrayList<>();

    private List<Object> marginShape = new ArrayList<>();

    /**
     * Shape bounds
     */
    public List<Double> getBounds() {
        return bounds;
    }

    /**
     * Shape bounds
     */
    public void setBounds(List<Double> bounds) {
        this.bounds = bounds;
    }

    /**
     * Shape coordinate details
     */
    public List<Object> getShape() {
        return shape;
    }

    /**
     * Shape coordinate details
     */
    public void setShape(List<Object> shape) {
        this.shape = shape;
    }

    /**
     * Margin shape bounds
     */
    public List<Object> getMarginShape() {
        return marginShape;
    }

    /**
     * Margin shape bounds
     */
    public void setMarginShape(List<Object> marginShape) {
        this.marginShape = marginShape;
    }
}
