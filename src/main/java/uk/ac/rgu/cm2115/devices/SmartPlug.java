package uk.ac.rgu.cm2115.devices;

public class SmartPlug {
    
    private boolean isOn = false;

    public void switchOn(){
        if(isOn == false){
            this.isOn = true;
            System.out.println("Smart plug is on");
        }else{
            System.out.println("Smart plug already on");
        }
    }

    public void switchOff(){
        if(isOn == true){
            this.isOn = false;
            System.out.println("smart plug OFF");

            }else{
                System.out.println("smart plug already off");
            }
        }
    }

