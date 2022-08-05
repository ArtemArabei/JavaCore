package Lection_17.Java_Design_Patterns.Examples.LogisticApp;



public class TestDelivery {
    private static LogisticsApp logistic;

    public static void main(String[] args) {

        configure();
        runBusinessLogic();
    }

    static void configure() {
        int tr = 2;
        if (tr == 1) {
            logistic = new RoadLogistics();
        } else {
            logistic = new SeaLogistics();
        }
    }

    static void runBusinessLogic() {
        logistic.createLogistic();
    }

}
