package main.java.com.pin360.controllers;

import main.java.com.pin360.manager.DeviceEventsImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * Created by Isuru on 5/4/2014.
 */
@Controller
@RequestMapping("/device/installation")
public class DeviceController {
    @RequestMapping(method = RequestMethod.GET, value = "/{mac_address}/{device_name}")
    public void installDevice(@PathVariable String mac_address,@PathVariable String device_name){
        DeviceEventsImpl deviceEventsImpl = new DeviceEventsImpl();
        deviceEventsImpl.insertNewDevice(mac_address,device_name);
    }
}
