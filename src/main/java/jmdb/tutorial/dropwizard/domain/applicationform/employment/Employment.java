package jmdb.tutorial.dropwizard.domain.applicationform.employment;

import ixcode.platform.time.DateRange;

public class Employment {

    private final DateRange employmentPeriod;
    private final Employer employer;

    public Employment(DateRange employmentPeriod, Employer employer) {
        this.employmentPeriod = employmentPeriod;
        this.employer = employer;
    }
}