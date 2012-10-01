package jmdb.tutorial.dropwizard.app.person;

import jmdb.tutorial.dropwizard.app.FreemarkerView;
import jmdb.tutorial.dropwizard.domain.person.PersonDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/people/{id}")
@Produces(MediaType.TEXT_HTML)
public class PersonResource {
    private final PersonDao dao;

    public PersonResource(PersonDao dao) {
        this.dao = dao;
    }

    @GET
    public FreemarkerView getPerson(@PathParam("id") String id) {
        return new FreemarkerView("person/person.ftl", dao.find(id));
    }
}