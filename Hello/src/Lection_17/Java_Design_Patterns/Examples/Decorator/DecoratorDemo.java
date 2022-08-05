package Lection_17.Java_Design_Patterns.Examples.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        SportCar car1 = new FordMustang();
        System.out.println(car1.getInfo());
        System.out.println("������������ �������� " + car1.getMaxSpeed()
                + " ��/�");
        car1 = new Stage1(car1);
        System.out.println("\n" + car1.getInfo());
        System.out.println("������������ �������� " + car1.getMaxSpeed()
                + " ��/�");
        car1 = new Stage2(car1);
        System.out.println("\n" + car1.getInfo());
        System.out.println("������������ �������� " + car1.getMaxSpeed()
                + " ��/�");
        SportCar car2 = new Stage2(new Stage1(new NissanGtr()));
        System.out.println("\n" + car2.getInfo());
        System.out.println("������������ �������� " + car2.getMaxSpeed()
                + " ��/�");
    }
}
