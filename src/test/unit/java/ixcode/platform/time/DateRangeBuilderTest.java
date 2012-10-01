package ixcode.platform.time;


import org.junit.Test;

import static ixcode.platform.time.DateRangeBuilder.dateRangeFrom;

public class DateRangeBuilderTest {

    @Test
    public void can_parse_some_dates() {
        DateRange dateRange = dateRangeFrom("11/12/2012").to("01/02/2013");

        System.out.println(dateRange.toString());
    }

}