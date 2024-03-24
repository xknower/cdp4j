package io.webfolder.cdp.type.target;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

@Experimental
@Data
public class RemoteLocation {

    private String host;

    private Integer port;

}
