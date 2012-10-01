package ixcode.platform.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static java.lang.String.format;

public class DateParser {

    private static final SimpleDateFormat standardDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Date fromString(String dateString) {
        try {
            return new Date(standardDateFormat.parse(dateString));
        } catch (ParseException e) {
            throw new RuntimeException(format("Could not parse string date range [%s] (See Cause)", dateString), e);

        }
    }


}