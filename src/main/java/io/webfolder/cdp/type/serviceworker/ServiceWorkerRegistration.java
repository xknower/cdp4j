package io.webfolder.cdp.type.serviceworker;

import lombok.Data;

/**
 * ServiceWorker registration
 */
@Data
public class ServiceWorkerRegistration {

    private String registrationId;

    private String scopeURL;

    private Boolean isDeleted;

}
