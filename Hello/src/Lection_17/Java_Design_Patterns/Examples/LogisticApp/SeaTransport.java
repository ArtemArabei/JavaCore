package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public class SeaTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Груз принят на доставку морем");
        System.out.println("Груз доставлен морем");
    }
}
