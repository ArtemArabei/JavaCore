package Lection_17.Java_Design_Patterns.Examples.Proxy;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

