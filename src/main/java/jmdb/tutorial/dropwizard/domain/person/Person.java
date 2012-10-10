package jmdb.tutorial.dropwizard.domain.person;

import com.google.code.morphia.annotations.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;

public class Person {
    @Id ObjectId id;
    public String firstName;
    public String secondName;
    public int age;

    public Person() {}

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        return reflectionEquals(this, o, new String[]{"id"});
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}