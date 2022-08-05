package Lection_17.Java_Design_Patterns.Examples.Decorator;

public class Stage2 extends Decorator {
    SportCar car;

    public Stage2(SportCar car) {
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + Stage 2";
    }

    public int getMaxSpeed() {
        return car.getMaxSpeed() + 30;
    }
}
