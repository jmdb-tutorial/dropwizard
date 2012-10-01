package jmdb.tutorial.dropwizard.domain.person;

public class Person {
    private final String firstName;
    private final String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getName() {
        return firstName + " " + secondName;
    }
}