package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device {
    private int tempSetting = 0;

    public Thermostat(String name) {
        super(name);
        this.tempSetting = tempSetting;
    }

    public void turnUp(){
        if((tempSetting >= 0) && (tempSetting < 10)){
            tempSetting ++;
            System.out.println(name + " Thermostat set to " + (tempSetting * 10) + "%");
        }else{
            System.out.println(name + " temp is at max");
        }
    }

    public void turnDown(){
        if((tempSetting > 0) && (tempSetting <= 10)){
            this.tempSetting--;
            System.out.println(name + " Thermostat set to " + (tempSetting * 10) + ("%"));

        }else{
            System.out.println(name + " Temp at the lowest setting");
        }
    }
}
