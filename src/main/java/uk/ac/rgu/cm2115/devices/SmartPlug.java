package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.Switchable;

public class SmartPlug extends Device<PlugStatus> implements Switchable {

   // public PlugStatus status;
    
    public SmartPlug(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

   // private boolean isOn = false;

    
    @Override
    public void switchOn(){
        this.status = PlugStatus.ON;
    }

    @Override
    public void switchOff(){
        this.status = PlugStatus.OFF;
        }
    }

