package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Car {
    public Engine engine;
    public Driver driver;
    String carClass;
    String marka;
    int weight;

    public Car(String carClass, String marka, int weight, Engine engine,
               Driver driver) {
        this.carClass = carClass;
        this.marka = marka;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот направо");
    }

    public String toString() {
        return "Автомобиль: марка " + marka + ", класс автомобиля - "
                + carClass + ", вес " + weight + " кг\n" + engine + "\n"
                + driver;
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver("Джим Керри", 12, 37);
        Engine engine1 = new Engine("Toyota", 210);
        Car car1 = new Car("Седан", "Toyota", 1750, engine1, driver1);
        System.out.println(car1.toString());
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        System.out.println();
        Driver driver2 = new Driver("Джейсон Стэтхем", 5, 27);
        Engine engine2 = new Engine("Volvo", 400);
        Lorry lorry1 = new Lorry("Грузовой", "Volvo", 5000, 7000, engine2,
                driver2);
        System.out.println(lorry1.toString());
        lorry1.start();
        lorry1.stop();
        lorry1.turnLeft();
        lorry1.turnRight();
        System.out.println();
        Driver driver3 = new Driver("Вин Дизель", 8, 29);
        Engine engine3 = new Engine("Ferrari", 350);
        SportCar sportCar1 = new SportCar("Спортивный", "Ferrari", 1500, 350,
                engine3, driver3);
        System.out.println(sportCar1.toString());
        sportCar1.start();
        sportCar1.stop();
        sportCar1.turnLeft();
        sportCar1.turnRight();
    }
}
