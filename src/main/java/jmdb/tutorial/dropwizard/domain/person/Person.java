package jmdb.tutorial.dropwizard.domain.person;

import com.google.code.morphia.annotations.Id;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

public class Person {
    @Id ObjectId id;
    private String firstName;
    private String secondName;
    private int age;

    public Person() {}

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

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o, new String[] {"id"});
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}