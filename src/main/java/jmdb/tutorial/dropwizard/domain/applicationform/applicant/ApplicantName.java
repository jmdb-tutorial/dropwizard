package jmdb.tutorial.dropwizard.domain.applicationform.applicant;

import net.sf.oval.constraint.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ApplicantName {

    @NotNull
    @NotEmpty
    @MaxLength(10)
    @MinLength(4)
    private final String firstName;

    @MaxLength(2)
    @MatchPattern(pattern = {"[A-Z]"})
    private final String lastName;

    private final String favouriteColor;
    private final List<String> favouriteBooks;

    public ApplicantName(String firstName, String lastName, String favouriteColor, List<String> favouriteBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteColor = favouriteColor;
        this.favouriteBooks = favouriteBooks;
    }

    public ApplicantName(String firstName, String lastName, String favouriteColor) {
        this(firstName, lastName, favouriteColor, new ArrayList<String>());
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}