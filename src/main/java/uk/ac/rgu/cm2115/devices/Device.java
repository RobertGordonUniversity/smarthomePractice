package uk.ac.rgu.cm2115.devices;

public abstract class Device<T> {

    protected T status;
    protected final String name;


    

    public  Device(String name) {
        this.name = name;
    }

    final String getName(){
        return name;
    }

    public final T getStatus(){
        return status;
    }

    @Override
    
    public final String toString() {
        return name + getClass().getSimpleName();
    }

    

}
