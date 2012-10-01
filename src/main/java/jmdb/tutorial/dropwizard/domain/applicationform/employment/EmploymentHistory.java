package jmdb.tutorial.dropwizard.domain.applicationform.employment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmploymentHistory implements Iterable<Employment> {

    private final List<Employment> employments = new ArrayList<Employment>();

    public EmploymentHistory() {
    }

    public void addEmployment(Employment employment) {
        employments.add(employment);
    }


    @Override public Iterator<Employment> iterator() {
        return employments.iterator();
    }
}