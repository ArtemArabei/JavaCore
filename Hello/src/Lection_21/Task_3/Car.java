package Lection_21.Task_3;

public class Car {
    String name;
    CarModel carModel;
    int engineÑapacity;

    Car(String name, CarModel carModel, int engineÑapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineÑapacity = engineÑapacity;
    }

    public String getName() {
        return name;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public int getEngineÑapacity() {
        return engineÑapacity;
    }

    public void setEngineÑapacity(int engineÑapacity) {
        this.engineÑapacity = engineÑapacity;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + carModel + " " + engineÑapacity;
    }
}
