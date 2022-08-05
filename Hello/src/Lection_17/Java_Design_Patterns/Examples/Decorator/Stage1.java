package Lection_17.Java_Design_Patterns.Examples.Decorator;

public class Stage1 extends Decorator {
    SportCar car;

    public Stage1(SportCar car) {
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + Stage 1";
    }

    public int getMaxSpeed() {
        return car.getMaxSpeed() + 20;
    }
}
