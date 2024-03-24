package io.webfolder.cdp.event.serviceworker;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.serviceworker.ServiceWorkerErrorMessage;
import lombok.Data;

@Domain("ServiceWorker")
@EventName("workerErrorReported")
@Data
public class WorkerErrorReported {

    private ServiceWorkerErrorMessage errorMessage;

}
