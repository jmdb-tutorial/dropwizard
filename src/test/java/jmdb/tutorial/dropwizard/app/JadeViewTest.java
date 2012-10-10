package jmdb.tutorial.dropwizard.app;

import de.neuland.jade4j.Jade4J;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.StringContains.containsString;

public class JadeViewTest {

    @Test
    public void should_render_a_jade_template_to_html() throws IOException {

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("greeting", "Hello World!");

        URL url = JadeViewTest.class.getResource("index.jade");
        String html = Jade4J.render(url, model);

        assertThat(html, containsString("Hello World!"));
    }
}
