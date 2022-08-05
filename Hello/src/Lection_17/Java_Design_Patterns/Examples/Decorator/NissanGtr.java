package Lection_17.Java_Design_Patterns.Examples.Decorator;

public class NissanGtr extends SportCar{
    public NissanGtr() {
        name = "Nissan Gtr";
    }

    @Override
    public int getMaxSpeed() {
        return 330;
    }
}
