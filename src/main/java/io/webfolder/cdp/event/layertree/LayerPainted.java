package io.webfolder.cdp.event.layertree;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.dom.Rect;
import lombok.Data;

@Domain("LayerTree")
@EventName("layerPainted")
@Data
public class LayerPainted {

    /**
     * The id of the painted layer.
     */
    private String layerId;
    /**
     * Clip rectangle.
     */
    private Rect clip;

}
