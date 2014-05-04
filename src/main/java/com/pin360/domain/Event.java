package main.java.com.pin360.domain;

import java.util.Date;

/**
 * Created by Isuru on 5/4/2014.
 */
public class Event {
    public String event_id;
    public String organizers_name;
    public Date event_due_date;
    public double event_place_latitude;
    public double event_place_longitude;
    public String event_place;
    public String event_description;
    public String open_or_invited;

    public String getOpen_or_invited() {
        return open_or_invited;
    }

    public void setOpen_or_invited(String open_or_invited) {
        this.open_or_invited = open_or_invited;
    }

    public String getEvent_place() {
        return event_place;
    }

    public void setEvent_place(String event_place) {
        this.event_place = event_place;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

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

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }
}
