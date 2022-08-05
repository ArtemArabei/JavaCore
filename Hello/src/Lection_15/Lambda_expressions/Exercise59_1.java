package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Exercise59_1 implements Callable {

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<ArrayList<Integer>>> set = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            Future<ArrayList<Integer>> future = pool.submit(() -> {
                ArrayList<Integer> randomNumbers = new ArrayList<>();
                String numbers = "";
                for (int j = 0; j < 10; j++) {
                    randomNumbers.add((int) (Math.random() * 100));
                    numbers = numbers + randomNumbers.get(j) + ", ";
                }
                System.out.println(Thread.currentThread().getName()
                        + ": сгенерировал коллекцию целых чисел: " + numbers);
                int sleepTime = ((int) (Math.random() * 10) + 1) * 1000;
                System.out.println("\t" + Thread.currentThread().getName()
                        + ": заснул на: " + sleepTime / 1000 + " секунд(у/ы)");
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return randomNumbers;
            });
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

    @Override
    public Object call() {
        return null;
    }
}
