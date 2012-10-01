package jmdb.tutorial.dropwizard.applicationform.applicant;

import jmdb.tutorial.dropwizard.applicationform.address.Address;

public class Applicant {

    private final ApplicantName name;
    private final Address currentAddress;

    public Applicant(ApplicantName name, Address currentAddress) {
        this.name = name;
        this.currentAddress = currentAddress;
    }
}