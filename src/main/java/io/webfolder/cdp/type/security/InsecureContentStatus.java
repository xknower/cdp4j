package io.webfolder.cdp.type.security;

/**
 * Information about insecure content on the page
 */
public class InsecureContentStatus {
    private Boolean ranMixedContent;

    private Boolean displayedMixedContent;

    private Boolean containedMixedForm;

    private Boolean ranContentWithCertErrors;

    private Boolean displayedContentWithCertErrors;

    private SecurityState ranInsecureContentStyle;

    private SecurityState displayedInsecureContentStyle;

    /**
     * True if the page was loaded over HTTPS and ran mixed (HTTP) content such as scripts.
     */
    public Boolean isRanMixedContent() {
        return ranMixedContent;
    }

    /**
     * True if the page was loaded over HTTPS and ran mixed (HTTP) content such as scripts.
     */
    public void setRanMixedContent(Boolean ranMixedContent) {
        this.ranMixedContent = ranMixedContent;
    }

    /**
     * True if the page was loaded over HTTPS and displayed mixed (HTTP) content such as images.
     */
    public Boolean isDisplayedMixedContent() {
        return displayedMixedContent;
    }

    /**
     * True if the page was loaded over HTTPS and displayed mixed (HTTP) content such as images.
     */
    public void setDisplayedMixedContent(Boolean displayedMixedContent) {
        this.displayedMixedContent = displayedMixedContent;
    }

    /**
     * True if the page was loaded over HTTPS and contained a form targeting an insecure url.
     */
    public Boolean isContainedMixedForm() {
        return containedMixedForm;
    }

    /**
     * True if the page was loaded over HTTPS and contained a form targeting an insecure url.
     */
    public void setContainedMixedForm(Boolean containedMixedForm) {
        this.containedMixedForm = containedMixedForm;
    }

    /**
     * True if the page was loaded over HTTPS without certificate errors, and ran content such as
     * scripts that were loaded with certificate errors.
     */
    public Boolean isRanContentWithCertErrors() {
        return ranContentWithCertErrors;
    }

    /**
     * True if the page was loaded over HTTPS without certificate errors, and ran content such as
     * scripts that were loaded with certificate errors.
     */
    public void setRanContentWithCertErrors(Boolean ranContentWithCertErrors) {
        this.ranContentWithCertErrors = ranContentWithCertErrors;
    }

    /**
     * True if the page was loaded over HTTPS without certificate errors, and displayed content
     * such as images that were loaded with certificate errors.
     */
    public Boolean isDisplayedContentWithCertErrors() {
        return displayedContentWithCertErrors;
    }

    /**
     * True if the page was loaded over HTTPS without certificate errors, and displayed content
     * such as images that were loaded with certificate errors.
     */
    public void setDisplayedContentWithCertErrors(Boolean displayedContentWithCertErrors) {
        this.displayedContentWithCertErrors = displayedContentWithCertErrors;
    }

    /**
     * Security state representing a page that ran insecure content.
     */
    public SecurityState getRanInsecureContentStyle() {
        return ranInsecureContentStyle;
    }

    /**
     * Security state representing a page that ran insecure content.
     */
    public void setRanInsecureContentStyle(SecurityState ranInsecureContentStyle) {
        this.ranInsecureContentStyle = ranInsecureContentStyle;
    }

    /**
     * Security state representing a page that displayed insecure content.
     */
    public SecurityState getDisplayedInsecureContentStyle() {
        return displayedInsecureContentStyle;
    }

    /**
     * Security state representing a page that displayed insecure content.
     */
    public void setDisplayedInsecureContentStyle(SecurityState displayedInsecureContentStyle) {
        this.displayedInsecureContentStyle = displayedInsecureContentStyle;
    }
}
