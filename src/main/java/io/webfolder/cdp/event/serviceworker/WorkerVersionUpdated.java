package io.webfolder.cdp.event.serviceworker;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.serviceworker.ServiceWorkerVersion;

import java.util.ArrayList;
import java.util.List;

@Domain("ServiceWorker")
@EventName("workerVersionUpdated")
public class WorkerVersionUpdated {
    private List<ServiceWorkerVersion> versions = new ArrayList<>();

    public List<ServiceWorkerVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<ServiceWorkerVersion> versions) {
        this.versions = versions;
    }
}
