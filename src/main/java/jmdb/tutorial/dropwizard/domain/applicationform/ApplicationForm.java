package jmdb.tutorial.dropwizard.domain.applicationform;

import jmdb.tutorial.dropwizard.domain.applicationform.applicant.Applicant;
import jmdb.tutorial.dropwizard.domain.applicationform.employment.EmploymentHistory;

public class ApplicationForm {

    private final Applicant applicant;

    private final EmploymentHistory employmentHistory;

    public ApplicationForm(Applicant applicant, EmploymentHistory employmentHistory) {
        this.applicant = applicant;
        this.employmentHistory = employmentHistory;
    }
}