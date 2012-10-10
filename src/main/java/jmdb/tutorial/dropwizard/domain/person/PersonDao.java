package jmdb.tutorial.dropwizard.domain.person;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.query.Query;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;

import java.net.UnknownHostException;

public class PersonDao {

    private Datastore ds;

    public PersonDao()  {
        try {
            Morphia m = new Morphia();
            ds = m.createDatastore(new Mongo("localhost", 27017), "test");
            m.map(Person.class);
        } catch(UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public Person find(String id) {
        return ds.get(Person.class, new ObjectId(id));
    }

    public Person fakeFind(String id) {
        return new Person("Chris", "Cheshire", 29);
    }

    public String insert(Person person) {
        return ds.save(person).getId().toString();
    }
}