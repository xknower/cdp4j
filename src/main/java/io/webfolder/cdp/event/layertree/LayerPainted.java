package io.webfolder.cdp.event.layertree;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.dom.Rect;

@Domain("LayerTree")
@EventName("layerPainted")
public class LayerPainted {
    private String layerId;

    private Rect clip;

    /**
     * The id of the painted layer.
     */
    public String getLayerId() {
        return layerId;
    }

    /**
     * The id of the painted layer.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * Clip rectangle.
     */
    public Rect getClip() {
        return clip;
    }

    /**
     * Clip rectangle.
     */
    public void setClip(Rect clip) {
        this.clip = clip;
    }
}
