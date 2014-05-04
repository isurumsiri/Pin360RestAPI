package main.java.com.pin360.manager;

import main.java.com.pin360.domain.Device;

/**
 * Created by Isuru on 5/4/2014.
 */
public interface DeviceEvents {

    /**
     * registers a device during the app installation period
     * @param device : device object with details of the device to be registered
     */
    public void registerDevice(Device device);

    /**
     * creates a new instance of a device
     * @param mac_address : mac address of the device
     * @param device_name : device name
     */
    public void insertNewDevice(String mac_address, String device_name);
}
