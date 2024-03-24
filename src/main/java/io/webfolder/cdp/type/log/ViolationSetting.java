package io.webfolder.cdp.type.log;

import io.webfolder.cdp.type.constant.ViolationType;
import lombok.Data;

/**
 * Violation configuration setting
 */
@Data
public class ViolationSetting {

    /**
     * Violation type.
     */
    private ViolationType name;
    /**
     * Time threshold to trigger upon.
     */
    private Double threshold;

}
