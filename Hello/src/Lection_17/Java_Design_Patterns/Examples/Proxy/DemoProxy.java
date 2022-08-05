package Lection_17.Java_Design_Patterns.Examples.Proxy;

public class DemoProxy {
    public static void main(String[] args) {
        ParkingProxy proxy = new ParkingProxy(new ShoppingMallParking());
        proxy.enter(new Car("����������� �����"));
        proxy.enter(new Car("������ �����"));
        proxy.enter(new Car("���� ������"));
        proxy.enter(new Car("���� �5"));
        proxy.enter(new Car("��� �5"));
    }
}
