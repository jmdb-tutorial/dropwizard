package jmdb.tutorial.dropwizard.app.person;

import jmdb.tutorial.dropwizard.app.FreemarkerView;
import jmdb.tutorial.dropwizard.app.JadeView;
import jmdb.tutorial.dropwizard.domain.person.Person;
import jmdb.tutorial.dropwizard.domain.person.PersonDao;
import org.bson.types.ObjectId;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/people/{id}")
@Produces(MediaType.TEXT_HTML)
public class PersonResource {
    private final PersonDao dao;

    public PersonResource(PersonDao dao) {
        this.dao = dao;
    }

    @GET
    public JadeView getPerson(@PathParam("id") String id) {
        Map<String, Object> model = new HashMap<String, Object>();
        Person person = this.dao.fakeFind(id);
        //Person person = this.dao.find(id);
        model.put("data", person);
        return new JadeView(PersonResource.class.getResource("person.jade").getPath(), model);
    }
}