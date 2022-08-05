package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Lorry extends Car {

    int carrying;

    public Lorry(String carClass, String carCompany, int weight, int carrying, Engine engine, Driver driver) {
        super(carClass, carCompany, weight, engine, driver);
        this.carrying = carrying;
    }

    public String toString() {
        return "Автомобиль: марка " + marka + ", класс автомобиля - " + carClass + ", вес " + weight + " кг, грузоподъемность " + carrying + " кг\n" + engine + "\n" + driver;
    }
}
