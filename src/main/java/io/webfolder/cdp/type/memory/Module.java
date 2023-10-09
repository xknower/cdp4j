package io.webfolder.cdp.type.memory;

/**
 * Executable module information
 */
public class Module {
    private String name;

    private String uuid;

    private String baseAddress;

    private Double size;

    /**
     * Name of the module.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the module.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * UUID of the module.
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * UUID of the module.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Base address where the module is loaded into memory. Encoded as a decimal
     * or hexadecimal (0x prefixed) string.
     */
    public String getBaseAddress() {
        return baseAddress;
    }

    /**
     * Base address where the module is loaded into memory. Encoded as a decimal
     * or hexadecimal (0x prefixed) string.
     */
    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    /**
     * Size of the module in bytes.
     */
    public Double getSize() {
        return size;
    }

    /**
     * Size of the module in bytes.
     */
    public void setSize(Double size) {
        this.size = size;
    }
}
