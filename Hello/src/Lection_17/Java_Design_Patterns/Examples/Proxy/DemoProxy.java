package Lection_17.Java_Design_Patterns.Examples.Proxy;

public class DemoProxy {
    public static void main(String[] args) {
        ParkingProxy proxy = new ParkingProxy(new ShoppingMallParking());
        proxy.enter(new Car("Фольксваген Гольф"));
        proxy.enter(new Car("Тойота Камри"));
        proxy.enter(new Car("Рено Дастер"));
        proxy.enter(new Car("Ауди А5"));
        proxy.enter(new Car("БМВ М5"));
    }
}
