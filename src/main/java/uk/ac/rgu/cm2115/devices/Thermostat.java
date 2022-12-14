package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device<Adjusted> {
    //private int tempSetting = 0;

    //public Adjusted status;

    public Thermostat(String name) {
        super(name);
       // this.tempSetting = tempSetting;
    }

    public void increase(){
        this.status = Adjusted.INCREASED;
        
    }

    public void decrease(){
        this.status = Adjusted.DECREASED;
    }
}
