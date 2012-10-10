package jmdb.tutorial.dropwizard.app;

import com.yammer.dropwizard.views.View;
import jmdb.tutorial.dropwizard.domain.person.Person;

import java.util.Map;

public class JadeView extends View {

    private Map<String, Object> model;

    public JadeView(String templateName, Map<String,Object> model) {
        super(templateName);
        this.model = model;
    }

    public Map<String,Object> getModel() {
        return model;
    }
}
