package Lection_21.Task_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    void writeInformation(Map<Integer, List<Car>> sortedCars)
            throws IOException {
        File file = new File("c:/test/cars.txt");
        file.createNewFile();
        try (FileWriter writer1 = new FileWriter(file, false)) {
            writer1.write(sortedCars.toString());
            writer1.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Task3 task = new Task3();
        List<Car> cars = new ArrayList();
        Map<Integer, List<Car>> sortedCars = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Car car = new Car("A" + (int) (Math.random() * 100),
                    CarModel.crossover, (int) (Math.random() * 3) + 1);
            System.out.println(car.toString());
            cars.add(car);
        }
        System.out.println();
        System.out.println();
        List<Car> cars1 = new ArrayList();
        List<Car> cars2 = new ArrayList();
        List<Car> cars3 = new ArrayList();
        for (Car c : cars) {
            if (c.engine—apacity == 1) {
                cars1.add(c);
            } else if (c.engine—apacity == 2) {
                cars2.add(c);
            } else if (c.engine—apacity == 3) {
                cars3.add(c);
            }
        }
        sortedCars.put(1, cars1);
        sortedCars.put(2, cars2);
        sortedCars.put(3, cars3);
        task.writeInformation(sortedCars);
    }
}
