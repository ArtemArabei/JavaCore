package Lection_17.Java_Design_Patterns.Examples.Decorator;

abstract class SportCar {
    String name = "";

    public String getInfo() {
        return name;
    }

    public abstract int getMaxSpeed();
}
