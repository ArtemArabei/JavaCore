package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public abstract class LogisticsApp {

    public void createLogistic() {
        Transport transport = createTransport();
        transport.deliver();
    }

    /**
     * ѕодклассы будут переопредел€ть этот метод, чтобы создавать конкретные
     * объекты продуктов, разные дл€ каждой фабрики.
     */
    public abstract Transport createTransport();
}
