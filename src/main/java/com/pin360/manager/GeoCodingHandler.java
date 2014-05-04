package main.java.com.pin360.manager;

import java.util.List;

/**
 * Created by Isuru on 5/4/2014.
 */
public interface GeoCodingHandler {

    /**
     * get the actual name of a given latitude and longitude of a place
     * @param lat : latitude of the place
     * @param log : longitude of the place
     * @return : actual name of the lat and log
     */
    public String getActualPlace(double lat, double log);

    /**
     * get the latitude and longitude of a given place
     * @param place : actual name of the place
     * @return : a list consist of latitude and longitude in corresponding order
     */
    public List<Double> getLantAndLog(String place);
}
