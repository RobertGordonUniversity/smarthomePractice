package uk.ac.rgu.cm2115.devices;

public class Light extends Device {

    
    public Light(String name) {
        super(name);
        this.lightLevel = lightLevel;
        this.isOn = isOn;
    }

    private int lightLevel = 0;
    private boolean isOn = false;


    public void switchOn(){
        if(isOn == false){
            this.isOn = true;
            System.out.println(name + " light is ON");
            
        }else{
            System.out.println(name +"light is already switched on");
        }

        
    }

    public void switchOff(){
        if(isOn == true){
            this.isOn = false;
            System.out.println(name + " light is OFF");
        } else{
            System.out.println(name + " light is alreasdy off");
        }
       
    }

    public void dimUp(){
        if ((lightLevel >= 0) && (lightLevel < 10)){
            lightLevel++;
            System.out.println(name + " lights are at " + (lightLevel * 10) + " percent.");

        } else{
            System.out.println(name + " lights at 100 percent");
        }
    }

    public void dimDown(){
        if((lightLevel <= 10) && (lightLevel > 0)){
            lightLevel --;
            System.out.println(name + " lights are at " + (lightLevel * 10) + " percent.");
        }else{
            System.out.println(name + " lights at 100 percent");

        }
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    
}
