package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class GetHeapUsageResult {

    private Double usedSize;

    private Double totalSize;

}
