package Lection_13.Threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Exercise54_1 extends Thread {

    public void run() {
        try {
            storeToFile(generateArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int[] generateArray() {
        int numberOfNumbers = 10; // количество целых чисел в массиве
        int maxValue = 1000; // максимальное значение целых чисел (для
        // диапазона значений)
        Random rand = new Random();
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        String arrayNumbers = "";
        for (int element : array) {
            arrayNumbers = arrayNumbers + element + ", ";
        }
        System.out.println(getName() + ": Массив состоит из следующих чисел: "
                + arrayNumbers);
        return array;
    }

    public void storeToFile(int[] array) throws IOException {
        File file = new File("c:/test/" + getName() + ".txt");
        file.createNewFile();
        try (FileWriter writer = new FileWriter(file, false)) {
            for (int element : array) {
                writer.write(element + ", ");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Exercise54_1 myThreadi = new Exercise54_1();
            myThreadi.start();
        }
    }
}
