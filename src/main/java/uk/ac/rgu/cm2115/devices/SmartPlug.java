package uk.ac.rgu.cm2115.devices;

public class SmartPlug extends Device {
    
    public SmartPlug(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    private boolean isOn = false;

    public void switchOn(){
        if(isOn == false){
            this.isOn = true;
            System.out.println(name + " Smart plug is on");
        }else{
            System.out.println(name + " Smart plug already on");
        }
    }

    public void switchOff(){
        if(isOn == true){
            this.isOn = false;
            System.out.println(name + " smart plug OFF");

            }else{
                System.out.println(name + " smart plug already off");
            }
        }
    }

