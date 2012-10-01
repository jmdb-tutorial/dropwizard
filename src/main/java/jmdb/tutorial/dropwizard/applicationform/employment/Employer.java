package jmdb.tutorial.dropwizard.applicationform.employment;

import jmdb.tutorial.dropwizard.applicationform.address.Address;

public class Employer {

    private final EmployerName employerName;
    private final Address address;

    public Employer(EmployerName employerName, Address address) {
        this.employerName = employerName;
        this.address = address;
    }
}