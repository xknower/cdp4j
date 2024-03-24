package io.webfolder.cdp.type.storage;

import com.google.gson.annotations.SerializedName;

/**
 * Enum of possible storage types
 */
public enum StorageType {

    @SerializedName("appcache")
    Appcache("appcache"),

    @SerializedName("cookies")
    Cookies("cookies"),

    @SerializedName("file_systems")
    FileSystems("file_systems"),

    @SerializedName("indexeddb")
    Indexeddb("indexeddb"),

    @SerializedName("local_storage")
    LocalStorage("local_storage"),

    @SerializedName("shader_cache")
    ShaderCache("shader_cache"),

    @SerializedName("websql")
    Websql("websql"),

    @SerializedName("service_workers")
    ServiceWorkers("service_workers"),

    @SerializedName("cache_storage")
    CacheStorage("cache_storage"),

    @SerializedName("all")
    All("all"),

    @SerializedName("other")
    Other("other");

    public final String value;

    StorageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
