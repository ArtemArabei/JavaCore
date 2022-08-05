package Lection_14.Multithreading;

import java.util.*;
import java.util.concurrent.*;

public class Exercise59 implements Callable {

    public ArrayList<Integer> call() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        int numberOfNumbers = 10; // ���������� ����� ����� � �������
        int maxValue = 100; // ������������ �������� ����� �����
        Random rand = new Random();
        String numbers = "";
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add(i, rand.nextInt(maxValue));
            numbers = numbers + randomNumbers.get(i) + ", ";
        }
        System.out.println(Thread.currentThread().getName()
                + ": ������������ ��������� ����� �����: " + numbers);
        int sleepTime = (rand.nextInt(10) + 1) * 1000;
        System.out.println("\t" + Thread.currentThread().getName()
                + ": ������ ��: " + sleepTime / 1000 + " ������(�/�)");
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
                    + ": �������� � ����� ����� ����� ���������: " + sum);
        }
        pool.shutdown();
    }
}