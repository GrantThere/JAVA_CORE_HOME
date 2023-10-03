package HW_5;

public class Car {
    private String name;
    private float power;
    private Owner owner;
    private double yeaR;
    private double price;

    public Car(String name, float power, Owner owner, double yeaR, double price) {
        this.name = name;
        this.power = power;
        this.owner = owner;
        this.yeaR = yeaR;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getYeaR() {
        return yeaR;
    }

    public void setYeaR(double yeaR) {
        this.yeaR = yeaR;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void repairCar(Car car) {
        car.power = (float) (car.power*1.1);
        System.out.println(car.name + " repaired!");
        System.out.println("Current power:" + car.power);
    }

}


