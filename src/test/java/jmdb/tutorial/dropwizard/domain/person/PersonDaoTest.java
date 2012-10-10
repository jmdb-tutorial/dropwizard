package jmdb.tutorial.dropwizard.domain.person;

import org.bson.types.ObjectId;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonDaoTest {

    @Test
    @Ignore("Need to work out what to do about integration tests")
    public void should_insert_persons() {
        PersonDao dao = new PersonDao();
        Person jim = new Person("James", "Barritt", 40);
        String jimId = dao.insert(jim);
        dao.insert(new Person("Ilias", "Bartolini", 32));
        dao.insert(new Person("John", "Cowie", 25));


        assertEquals(jim, dao.find(jimId));
    }

}
