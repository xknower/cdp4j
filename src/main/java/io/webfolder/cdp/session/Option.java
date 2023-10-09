package io.webfolder.cdp.session;

import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * The HTML &lt;option&gt; element is used to define an item contained in a &lt;select&gt;,
 * an &lt;optgroup&gt;, or a &lt;datalist&gt; element.
 */
public class Option {

    private Integer index;

    private Boolean selected;

    private String value;

    private String text;

    private String group;

    static TypeToken<List<Option>> TYPE_TOKEN = new TypeToken<List<Option>>() {
    };

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean isSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Option [index=" + index + ", selected=" + selected + ", value=" + value + ", text=" + text + ", group="
                + group + "]";
    }
}
