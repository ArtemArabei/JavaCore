package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Exercise52_1 extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable test = () -> {
                int sum = 0;
                List randomNumbers = new ArrayList();
                for (int j = 0; j < 10; j++) {
                    randomNumbers.add((int) (Math.random() * (1000 + 1)));
                    sum = sum + (int) randomNumbers.get(j);
                }
                System.out.println(Thread.currentThread().getName()
                        + ": Стартовая коллекция выглядит так: "
                        + randomNumbers + ", \tсреднее арифметическое " +
                        "коллекции " + "такое: " + sum / 10);
            };
            new Thread(test).start();
        }
    }
}
