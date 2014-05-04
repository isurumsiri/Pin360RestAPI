package main.java.com.pin360.manager;

import main.java.com.pin360.domain.Device;

/**
 *
 * Created by Isuru on 5/4/2014.
 */
public class DeviceEventsImpl implements DeviceEvents {
    @Override
    public void registerDevice(Device device) {

    }

    @Override
    public void insertNewDevice(String mac_address, String device_name) {

        Device newDevice = new Device();

        newDevice.setDevice_mac_address(mac_address);
        newDevice.setDevice_name(device_name);

        registerDevice(newDevice);
    }
}
