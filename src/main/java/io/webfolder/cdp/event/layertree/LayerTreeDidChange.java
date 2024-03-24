package io.webfolder.cdp.event.layertree;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.layertree.Layer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Domain("LayerTree")
@EventName("layerTreeDidChange")
@Data
public class LayerTreeDidChange {

    /**
     * Layer tree, absent if not in the comspositing mode.
     */
    private List<Layer> layers = new ArrayList<>();

}
