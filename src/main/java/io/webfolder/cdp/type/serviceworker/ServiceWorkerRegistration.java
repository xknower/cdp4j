package io.webfolder.cdp.type.serviceworker;

/**
 * ServiceWorker registration
 */
public class ServiceWorkerRegistration {
    private String registrationId;

    private String scopeURL;

    private Boolean isDeleted;

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getScopeURL() {
        return scopeURL;
    }

    public void setScopeURL(String scopeURL) {
        this.scopeURL = scopeURL;
    }

    public Boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
