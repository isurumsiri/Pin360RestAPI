package main.java.com.pin360.domain;

import java.util.Date;

/**
 * Created by Isuru on 5/5/2014.
 */
public class EventReq {
    private String organizers_name;
    private Date event_due_date;
    private double event_place_latitude;
    private double event_place_longitude;
    private String event_description;
    private String open_or_invited;

    public String getOrganizers_name() {
        return organizers_name;
    }

    public void setOrganizers_name(String organizers_name) {
        this.organizers_name = organizers_name;
    }

    public Date getEvent_due_date() {
        return event_due_date;
    }

    public void setEvent_due_date(Date event_due_date) {
        this.event_due_date = event_due_date;
    }

    public double getEvent_place_latitude() {
        return event_place_latitude;
    }

    public void setEvent_place_latitude(double event_place_latitude) {
        this.event_place_latitude = event_place_latitude;
    }

    public double getEvent_place_longitude() {
        return event_place_longitude;
    }

    public void setEvent_place_longitude(double event_place_longitude) {
        this.event_place_longitude = event_place_longitude;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getOpen_or_invited() {
        return open_or_invited;
    }

    public void setOpen_or_invited(String open_or_invited) {
        this.open_or_invited = open_or_invited;
    }
}
