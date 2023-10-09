package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;

@Experimental
@Domain("ServiceWorker")
public interface ServiceWorker {
    void deliverPushMessage(String origin, String registrationId, String data);

    void disable();

    void dispatchSyncEvent(String origin, String registrationId, String tag, Boolean lastChance);

    void enable();

    void inspectWorker(String versionId);

    void setForceUpdateOnPageLoad(Boolean forceUpdateOnPageLoad);

    void skipWaiting(String scopeURL);

    void startWorker(String scopeURL);

    void stopAllWorkers();

    void stopWorker(String versionId);

    void unregister(String scopeURL);

    void updateRegistration(String scopeURL);
}
