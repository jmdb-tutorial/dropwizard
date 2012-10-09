package jmdb.tutorial.dropwizard.domain.person;

public class PersonDao {
    public Person find(String id) {
        return new Person("Jim", "Barritt", 40);
    }
}