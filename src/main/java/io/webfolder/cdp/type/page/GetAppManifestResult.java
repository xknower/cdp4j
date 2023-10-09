package io.webfolder.cdp.type.page;

import java.util.List;

public class GetAppManifestResult {
    private String url;

    private List<AppManifestError> errors;

    private String data;

    public String getUrl() {
        return url;
    }

    public List<AppManifestError> getErrors() {
        return errors;
    }

    public String getData() {
        return data;
    }
}
