package jmdb.tutorial.dropwizard.app.template;

import de.neuland.jade4j.Jade4J;
import jmdb.tutorial.dropwizard.app.JadeView;
import jmdb.tutorial.dropwizard.app.person.PersonResource;
import org.w3c.tidy.Tidy;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@Provider
@Produces(MediaType.TEXT_HTML)
public class JadeProvider implements MessageBodyWriter<JadeView> {

    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return JadeView.class.equals(aClass);
    }

    @Override
    public long getSize(JadeView o, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;  // Writes output of any size
    }

    @Override
    public void writeTo(JadeView jadeView, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> stringObjectMultivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {
        String output = Jade4J.render(jadeView.getTemplateName(), jadeView.getModel());
        new Tidy().parse(new ByteArrayInputStream(output.getBytes()), outputStream);
    }
}
