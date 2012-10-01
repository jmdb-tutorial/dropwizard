package jmdb.tutorial.dropwizard.app;

import com.yammer.dropwizard.views.View;

public class FreemarkerView extends View {


    private Object data;

    public FreemarkerView(String templateName) {
        this(templateName, null);
    }

    public FreemarkerView(String templateName, Object data) {
        super(templateName);
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}