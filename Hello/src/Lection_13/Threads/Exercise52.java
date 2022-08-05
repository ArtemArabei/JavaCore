package Lection_13.Threads;

import java.util.ArrayList;
import java.util.List;

public class Exercise52 extends Thread {

    public void run() {
        int numberOfNumbers = 10; // количество целых чисел в коллекции
        int maxValue = 10000; // максимальное значение целых чисел (для
        // диапазона значений)
        int sum = 0;
        List randomNumbers = new ArrayList();
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add((int) (Math.random() * (maxValue + 1)));
            sum = sum + (int) randomNumbers.get(i);
        }
        System.out.println(getName() + ": Стартовая коллекция выглядит так: "
                + randomNumbers + ",  \tсреднее арифметическое коллекции " +
                "такое: " + sum / numberOfNumbers);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Exercise52 myThreadi = new Exercise52();
            myThreadi.start();
        }
    }
}
