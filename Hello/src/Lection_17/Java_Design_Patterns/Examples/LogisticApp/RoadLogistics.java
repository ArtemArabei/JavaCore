package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public class RoadLogistics extends LogisticsApp{
    @Override
    public Transport createTransport() {
        return new RoadTransport();
    }

}
