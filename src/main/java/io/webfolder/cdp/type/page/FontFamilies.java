package io.webfolder.cdp.type.page;

import io.webfolder.cdp.annotation.Experimental;

/**
 * Generic font families collection
 */
@Experimental
public class FontFamilies {
    private String standard;

    private String fixed;

    private String serif;

    private String sansSerif;

    private String cursive;

    private String fantasy;

    private String pictograph;

    /**
     * The standard font-family.
     */
    public String getStandard() {
        return standard;
    }

    /**
     * The standard font-family.
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * The fixed font-family.
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * The fixed font-family.
     */
    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    /**
     * The serif font-family.
     */
    public String getSerif() {
        return serif;
    }

    /**
     * The serif font-family.
     */
    public void setSerif(String serif) {
        this.serif = serif;
    }

    /**
     * The sansSerif font-family.
     */
    public String getSansSerif() {
        return sansSerif;
    }

    /**
     * The sansSerif font-family.
     */
    public void setSansSerif(String sansSerif) {
        this.sansSerif = sansSerif;
    }

    /**
     * The cursive font-family.
     */
    public String getCursive() {
        return cursive;
    }

    /**
     * The cursive font-family.
     */
    public void setCursive(String cursive) {
        this.cursive = cursive;
    }

    /**
     * The fantasy font-family.
     */
    public String getFantasy() {
        return fantasy;
    }

    /**
     * The fantasy font-family.
     */
    public void setFantasy(String fantasy) {
        this.fantasy = fantasy;
    }

    /**
     * The pictograph font-family.
     */
    public String getPictograph() {
        return pictograph;
    }

    /**
     * The pictograph font-family.
     */
    public void setPictograph(String pictograph) {
        this.pictograph = pictograph;
    }
}
