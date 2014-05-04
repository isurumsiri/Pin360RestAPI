package main.java.com.pin360.domain;

import java.util.Date;

/**
 * Created by Isuru on 5/4/2014.
 */
public class EventPlacements {
    public String device_mac_address;
    public String event_id;
    public Date published_date;

    public String getDevice_mac_address() {
        return device_mac_address;
    }

    public void setDevice_mac_address(String device_mac_address) {
        this.device_mac_address = device_mac_address;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }
}
