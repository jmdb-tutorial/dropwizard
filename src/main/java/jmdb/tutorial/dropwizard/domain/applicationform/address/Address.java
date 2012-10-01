package jmdb.tutorial.dropwizard.domain.applicationform.address;

public class Address {

    private final String houseNumberOrName;
    private final String secondLine;

    private final String town;

    private final Postcode postcode;

    public Address(String houseNumberOrName, String secondLine, String town, Postcode postcode) {
        this.houseNumberOrName = houseNumberOrName;
        this.secondLine = secondLine;
        this.town = town;
        this.postcode = postcode;
    }
}