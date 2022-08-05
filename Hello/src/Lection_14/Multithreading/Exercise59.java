package Lection_14.Multithreading;

import java.util.*;
import java.util.concurrent.*;

public class Exercise59 implements Callable {

    public ArrayList<Integer> call() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        int numberOfNumbers = 10; // количество целых чисел в массиве
        int maxValue = 100; // максимальное значение целых чисел
        Random rand = new Random();
        String numbers = "";
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add(i, rand.nextInt(maxValue));
            numbers = numbers + randomNumbers.get(i) + ", ";
        }
        System.out.println(Thread.currentThread().getName()
                + ": сгенерировал коллекцию целых чисел: " + numbers);
        int sleepTime = (rand.nextInt(10) + 1) * 1000;
        System.out.println("\t" + Thread.currentThread().getName()
                + ": заснул на: " + sleepTime / 1000 + " секунд(у/ы)");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomNumbers;
    }

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<ArrayList<Integer>>> set =
                new LinkedHashSet<Future<ArrayList<Integer>>>();
        Callable<ArrayList<Integer>> callable = new Exercise59();
        for (int i = 0; i < 10; i++) {
            Future<ArrayList<Integer>> future = pool.submit(callable);
            set.add(future);
        }

        for (Future<ArrayList<Integer>> future : set) {
            int sum = 0;
            try {
                for (Integer fut : future.get()) {
                    sum = sum + fut;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()
                    + ": посчитал и вывел сумму чисел коллекции: " + sum);
        }
        pool.shutdown();
    }
}