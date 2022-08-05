package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public class RoadTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("Груз принят на доставку по суше");
        System.out.println("Груз доставлен по суше");
    }
}
