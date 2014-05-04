package main.java.com.pin360.domain;

/**
 * Created by Isuru on 5/4/2014.
 */
public class Device {
    public String device_mac_address;
    public  String device_name;

    public String getDevice_mac_address() {
        return device_mac_address;
    }

    public void setDevice_mac_address(String device_mac_address) {
        this.device_mac_address = device_mac_address;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }
}
