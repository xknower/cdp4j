package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

@Experimental
@Data
public class CustomPreview {

    /**
     * The JSON-stringified result of formatter.header(object, config) call.
     * It contains json ML array that represents RemoteObject.
     */
    private String header;
    /**
     * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will
     * contain RemoteObjectId for the function that returns result of formatter.body(object, config) call.
     * The result value is json ML array.
     */
    private String bodyGetterId;

}
