package Lection_17.Java_Design_Patterns.Examples.Decorator;

public class FordMustang extends SportCar {
    public FordMustang() {
        name = "Ford Mustang";
    }

    @Override
    public int getMaxSpeed() {
        return 300;
    }
}
