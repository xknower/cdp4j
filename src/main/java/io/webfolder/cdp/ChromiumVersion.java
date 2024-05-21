package io.webfolder.cdp;

public class ChromiumVersion {

    private final int revision;

    public ChromiumVersion(int revision) {
        this.revision = revision;
    }

    public int getRevision() {
        return revision;
    }

    @Override
    public String toString() {
        return "ChromiumVersion [revision=" + revision + "]";
    }

}
