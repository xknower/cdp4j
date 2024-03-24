package io.webfolder.cdp.session;

import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.util.List;

/**
 * The HTML &lt;option&gt; element is used to define an item contained in a &lt;select&gt;,
 * an &lt;optgroup&gt;, or a &lt;datalist&gt; element.
 */
@Data
public class Option {

    private Integer index;

    private Boolean selected;

    private String value;

    private String text;

    private String group;

    static TypeToken<List<Option>> TYPE_TOKEN = new TypeToken<List<Option>>() {
    };

    @Override
    public String toString() {
        return "Option [index=" + index + ", selected=" + selected + ", value=" + value + ", text=" + text + ", group="
                + group + "]";
    }

}
