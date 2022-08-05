package Lection_17.Java_Design_Patterns.Examples.Proxy;

public class ShoppingMallParking implements Parking {
    public void enter(Car car) {
        System.out.println(car + " заехал на стоянку");
    }
}

