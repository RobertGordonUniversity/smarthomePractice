package uk.ac.rgu.cm2115.devices;

public abstract class Device {
    
    protected String name;


    

    public Device(String name) {
        this.name = name;
    }

    final String getName(){
        return name;
    }

    @Override
    
    public final String toString() {
        return name + getClass().getSimpleName();
    }

    

}
