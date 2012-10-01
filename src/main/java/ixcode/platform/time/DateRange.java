package ixcode.platform.time;


public class DateRange {

    private final Date from;
    private final Date to;

    public DateRange(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public String toString() {
        return "from: " + from + ", to: " + to;
    }

}