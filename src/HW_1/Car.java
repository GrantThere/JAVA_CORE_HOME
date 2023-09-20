package HW_1;

public class Car {
    // model
    // power
    // volumeEngine
    // turbo

    private String model;
    private int power;
    private double volumeEngine;
    private boolean turbo;

    public  Car(String model, int power, double volumeEngine, boolean turbo){
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }


    /// GETTERS
    public String getModel() {
        return model;
    }

    public  int getPower() {
        return power;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    /// SETTERS
    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return model + "|" + power + "|" + volumeEngine+ "|" + turbo;
    }
}
