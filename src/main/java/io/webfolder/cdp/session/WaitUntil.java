package io.webfolder.cdp.session;

public enum WaitUntil {
    Load("load"), DomContentLoad("DOMContentLoaded"),
    /**
     * Consider navigation to be finished when there are no more than 0 network
     * connections for at least 500 ms.
     */
    NetworkIdle("networkIdle"),
    /**
     * Consider navigation to be finished when there are no more than 2 network
     * connections for at least 500 ms.
     */
    NetworkAlmostIdle("networkAlmostIdle"), DomReady("DomReady");

    public String value;

    WaitUntil(String value) {
        this.value = value;
    }

}
