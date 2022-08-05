package Lection_21.Task_3;

public class Car {
    String name;
    CarModel carModel;
    int engine�apacity;

    Car(String name, CarModel carModel, int engine�apacity) {
        this.name = name;
        this.carModel = carModel;
        this.engine�apacity = engine�apacity;
    }

    public String getName() {
        return name;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public int getEngine�apacity() {
        return engine�apacity;
    }

    public void setEngine�apacity(int engine�apacity) {
        this.engine�apacity = engine�apacity;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + carModel + " " + engine�apacity;
    }
}
