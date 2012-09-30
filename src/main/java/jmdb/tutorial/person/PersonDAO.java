package jmdb.tutorial.person;

public class PersonDAO {
    public Person find(String id) {
        return new Person("Jim", "Barritt");
    }
}