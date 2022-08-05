package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class SportCar extends Car {


    double speed;

    public SportCar(String carClass, String carCompany, int weight, double speed, Engine engine, Driver driver) {
        super(carClass, carCompany, weight, engine, driver);
        this.speed = speed;
    }

    public String toString() {
        return "����������: ����� " + marka + ", ����� ���������� - " + carClass + ", ��� " + weight + " ��, ������������ �������� " + speed + " ��/�\n" + engine + "\n" + driver;
    }
}
