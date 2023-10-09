package io.webfolder.cdp.event.layertree;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.layertree.Layer;

import java.util.ArrayList;
import java.util.List;

@Domain("LayerTree")
@EventName("layerTreeDidChange")
public class LayerTreeDidChange {
    private List<Layer> layers = new ArrayList<>();

    /**
     * Layer tree, absent if not in the comspositing mode.
     */
    public List<Layer> getLayers() {
        return layers;
    }

    /**
     * Layer tree, absent if not in the comspositing mode.
     */
    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
}
