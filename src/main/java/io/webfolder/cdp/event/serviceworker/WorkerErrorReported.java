package io.webfolder.cdp.event.serviceworker;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.serviceworker.ServiceWorkerErrorMessage;

@Domain("ServiceWorker")
@EventName("workerErrorReported")
public class WorkerErrorReported {
    private ServiceWorkerErrorMessage errorMessage;

    public ServiceWorkerErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ServiceWorkerErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}
