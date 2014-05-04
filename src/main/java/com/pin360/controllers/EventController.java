package main.java.com.pin360.controllers;

import main.java.com.pin360.domain.Event;
import main.java.com.pin360.domain.EventReq;
import main.java.com.pin360.manager.EventEventsImpl;
import main.java.com.pin360.manager.GeoCodinghandlerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 *
 * Created by Isuru on 5/4/2014.
 */
@Controller
@RequestMapping("/event")
public class EventController {

    EventEventsImpl eventHandler = new EventEventsImpl();

    GeoCodinghandlerImpl geoConverter = new GeoCodinghandlerImpl();

    @RequestMapping(method = RequestMethod.GET, value = "getByPlace/{lat}/{longi}")
    public @ResponseBody List<Event> getAllEvents(@PathVariable double lat, @PathVariable double longi){
        String place = geoConverter.getActualPlace(lat,longi);
        return eventHandler.loadAllEvents(place);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/prevPlacements/{mac_address}")
    public @ResponseBody List<Event> getPreviousPlacements(@PathVariable String mac_address){
        return eventHandler.loadPreviouslyPlacedEvents(mac_address);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addNewEvent")
    public void addNewEvent(@RequestBody EventReq reqEvent){
        Event newEvent = new Event();
        newEvent.setEvent_id(UUID.randomUUID().toString());
        newEvent.setEvent_description(reqEvent.getEvent_description());
        newEvent.setEvent_due_date(reqEvent.getEvent_due_date());
        newEvent.setOrganizers_name(reqEvent.getOrganizers_name());
        newEvent.setEvent_place_latitude(reqEvent.getEvent_place_latitude());
        newEvent.setEvent_place_longitude(reqEvent.getEvent_place_longitude());
        newEvent.setOpen_or_invited(reqEvent.getOpen_or_invited());
        newEvent.setEvent_place(geoConverter.getActualPlace(reqEvent.getEvent_place_latitude(),reqEvent.getEvent_place_longitude()));
        eventHandler.insertEvent(newEvent);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateEvent")
    public void updateEvent(@RequestBody EventReq reqUEvent){
        Event newEvent = new Event();
        newEvent.setEvent_id(UUID.randomUUID().toString());
        newEvent.setEvent_description(reqUEvent.getEvent_description());
        newEvent.setEvent_due_date(reqUEvent.getEvent_due_date());
        newEvent.setOrganizers_name(reqUEvent.getOrganizers_name());
        newEvent.setEvent_place_latitude(reqUEvent.getEvent_place_latitude());
        newEvent.setEvent_place_longitude(reqUEvent.getEvent_place_longitude());
        newEvent.setOpen_or_invited(reqUEvent.getOpen_or_invited());
        newEvent.setEvent_place(geoConverter.getActualPlace(reqUEvent.getEvent_place_latitude(),reqUEvent.getEvent_place_longitude()));

    }

}
