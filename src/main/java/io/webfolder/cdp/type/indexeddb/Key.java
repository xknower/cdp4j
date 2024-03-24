package io.webfolder.cdp.type.indexeddb;

import io.webfolder.cdp.type.constant.KeyType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Key
 */
@Data
public class Key {

    /**
     * Key type.
     */
    private KeyType type;
    /**
     * Number value.
     */
    private Double number;
    /**
     * String value.
     */
    private String string;
    /**
     * Date value.
     */
    private Double date;
    /**
     * Array value.
     */
    private List<Key> array = new ArrayList<>();

}
