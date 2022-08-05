package Lection_17.Java_Design_Patterns.Examples.Proxy;

public class ParkingProxy implements Parking {
    private static final int NUM_CARS_ALLOWED = 3;
    private int numCars;
    private final Parking parking;

    public ParkingProxy(Parking parking) {
        this.parking = parking;
    }

    @Override
    public void enter(Car car) {
        if (numCars < NUM_CARS_ALLOWED) {
            parking.enter(car);
            numCars++;
        } else {
            System.out.println(car + " не смог заехать, т.к. нет свободных мест");
        }
    }
}

