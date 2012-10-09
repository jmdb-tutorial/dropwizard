package jmdb.tutorial.dropwizard.domain.person;

public class Person {
    private final String firstName;
    private final String secondName;
    private final int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return firstName + " " + secondName;
    }

    public int getAge() {
        return age;
    }
}