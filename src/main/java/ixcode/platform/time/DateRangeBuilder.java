package ixcode.platform.time;

public class DateRangeBuilder {
    private final String startDate;

    private final DateParser dateParser = new DateParser();

    public DateRangeBuilder(String startDate) {
        this.startDate = startDate;
    }

    public static DateRangeBuilder dateRangeFrom(String startDate) {
        return new DateRangeBuilder(startDate);
    }

    public DateRange to(String endDate) {
        return new DateRange(dateParser.fromString(startDate),
                             dateParser.fromString(endDate));

    }
}