package main.java.com.pin360.manager;

import main.java.com.pin360.domain.Event;

import java.util.List;

/**
 * Created by Isuru on 5/4/2014.
 */
public interface EventEvents {

    /**
     * returns a list of events in a given place
     * @param place : reverse geo coded representation of the place required
     * @return : all the events in the specified location as place parameter
     */
    public List<Event> loadAllEvents(String place);

    /**
     * insert a naw event
     * @param event : event details to be inserted
     */
    public void insertEvent(Event event);

    /**
     * edit details of an event
     * @param event : event details to be inserted
     */
    public void editEvent(Event event);

    /**
     * load previously place events of a given device
     * @param deveice_mac_address : device mac address of the event placements to be loaded
     * @return : list of events placed under a given mac address
     */
    public List<Event> loadPreviouslyPlacedEvents(String deveice_mac_address);

    /**
     * deletes an event identified by a given event id ; not at this stage due to a UI specific time frame issues
     * @param event_id : event id of the event to be deleted
     */
    public void deleteEvent(String event_id);
}
