package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public class SeaLogistics extends LogisticsApp {
    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }

}
