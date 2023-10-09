package io.webfolder.cdp.event.serviceworker;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.serviceworker.ServiceWorkerRegistration;

import java.util.ArrayList;
import java.util.List;

@Domain("ServiceWorker")
@EventName("workerRegistrationUpdated")
public class WorkerRegistrationUpdated {
    private List<ServiceWorkerRegistration> registrations = new ArrayList<>();

    public List<ServiceWorkerRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<ServiceWorkerRegistration> registrations) {
        this.registrations = registrations;
    }
}
