package jmdb.tutorial.dropwizard.app.person;

import com.yammer.dropwizard.views.View;
import jmdb.tutorial.dropwizard.domain.person.Person;

public class PersonView extends View {
    private final Person person;

    public PersonView(Person person) {
        super("person.ftl");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}