package jmdb.tutorial.dropwizard.applicationform;

import jmdb.tutorial.dropwizard.applicationform.applicant.Applicant;
import jmdb.tutorial.dropwizard.applicationform.employment.EmploymentHistory;

public class ApplicationForm {

    private final Applicant applicant;

    private final EmploymentHistory employmentHistory;

    public ApplicationForm(Applicant applicant, EmploymentHistory employmentHistory) {
        this.applicant = applicant;
        this.employmentHistory = employmentHistory;
    }
}