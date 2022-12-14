package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.Dimmable;
import uk.ac.rgu.cm2115.Switchable;

public class Light extends Device<LightStatus> implements Switchable, Dimmable {

    public class Colour{
        private int r, g, b;

        public Colour(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getG() {
            return g;
        }

        public void setG(int g) {
            this.g = g;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return  + r + ", " + g + ", " + b  ;
        }

    }

    private Colour colour;
    //public LightStatus status;



    
    public Colour getColour() {
        return colour;
    }

    public void changeColour(int r, int g, int b){
        this.colour.setR(r);
        this.colour.setG(g);
        this.colour.setB(b);

    }




    public Light(String name) {
        super(name);
        this.colour = new Colour(255, 255, 255);
        this.status = LightStatus.ON;
        //this.lightLevel = lightLevel;
       // this.isOn = isOn;
    }

   /*  private int lightLevel = 0;
    private boolean isOn = false;*/

    @Override
    public void switchOn(){
        this.status = LightStatus.ON;
    }

    @Override
    public void switchOff(){
    this.status = LightStatus.OFF;

    }

    @Override
    public void dimUp(){
        this.status = LightStatus.DIMMED;
    }

    @Override
    public void dimDown(){
        this.status = LightStatus.DIMMED;
    }

    /*public int getLightLevel() {
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
    }*/
    
}
