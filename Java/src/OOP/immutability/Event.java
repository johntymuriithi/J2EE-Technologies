package OOP.immutability;

import java.util.Date;

public class Event {
    private final Date date;

    // You prevented external code from modifying your internal state

    public Event(Date date) {
        // this.date = date; // this is bad
        this.date = new Date(date.getTime());
    }

    public Date getDate() {
        // return date; // bad
        return new Date(date.getTime());
    }
}
