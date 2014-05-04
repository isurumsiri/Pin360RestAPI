package main.java.com.pin360.manager;

import main.java.com.pin360.domain.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Isuru on 5/4/2014.
 */
public class EventEventsImpl implements EventEvents {

    @Override
    public List<Event> loadAllEvents(String place) {
        List<Event> allEvents = new ArrayList<Event>();
        //TODO all events from hibernate
        return allEvents;
    }

    @Override
    public void insertEvent(Event event) {
        //TODO insert the event object to DB with hibernate
    }

    @Override
    public void editEvent(Event event) {
        //TODO update event in DB using event object with hibernate
    }

    @Override
    public List<Event> loadPreviouslyPlacedEvents(String deveice_mac_address) {
        List<Event> allPrevEvents = new ArrayList<Event>();
        //TODO load all previous placements from hibernate
        return allPrevEvents;
    }

    @Override
    public void deleteEvent(String event_id) {
        //not at this stage
    }
}
