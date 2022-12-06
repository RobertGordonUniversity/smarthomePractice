package uk.ac.rgu.cm2115;

public class Thermostat {
    private int tempSetting = 0;

    public void turnUp(){
        if((tempSetting >= 0) && (tempSetting < 10)){
            tempSetting ++;
            System.out.println("Thermostat set to " + (tempSetting * 10) + "%");
        }else{
            System.out.println("temp is at max");
        }
    }

    public void turnDown(){
        if((tempSetting > 0) && (tempSetting <= 10)){
            this.tempSetting--;
            System.out.println("Thermostat set to " + (tempSetting * 10) + ("%"));

        }else{
            System.out.println("Temp at the lowest setting");
        }
    }
}
