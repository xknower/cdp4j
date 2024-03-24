package io.webfolder.cdp.event.serviceworker;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.serviceworker.ServiceWorkerRegistration;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Domain("ServiceWorker")
@EventName("workerRegistrationUpdated")
@Data
public class WorkerRegistrationUpdated {

    private List<ServiceWorkerRegistration> registrations = new ArrayList<>();

}
