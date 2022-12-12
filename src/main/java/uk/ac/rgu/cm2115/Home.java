package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.devices.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.Thermostat;

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

    Device[] devices;
    

  
    
    public Device[] getDevices() {
          
        return devices;
    }

    public Home(Device[] devices) {
        
        this.devices = new Device[5];
    }

    public void addDevice(Device device){
        for(int i = 0; i < this.devices.length; i++){
            if(devices[i] == null){
                devices[i] = device;
                break;
            }
        }
    }



    public Home(){

    }
}
