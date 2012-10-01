package jmdb.tutorial.dropwizard.person;

public class PersonDAO {
    public Person find(String id) {
        return new Person("Jim", "Barritt");
    }
}