package Lection_15.Lambda_expressions;

import java.util.Arrays;

public class Exercise53_1 extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable test = () -> {
                int[] array = new int[10];
                int maxNumber = 0;
                for (int j = 0; j < 10; j++) {
                    array[j] = (int) (Math.random() * (1000 + 1));
                    if (array[j] > maxNumber) {
                        maxNumber = array[j];
                    }
                }
                System.out.println(Thread.currentThread().getName()
                        + ": ������ ������� �� ��������� �����: "
                        + Arrays.toString(array));
                System.out.println(Thread.currentThread().getName()
                        + ": �������� ������������� �������� �������: "
                        + maxNumber);
            };
            new Thread(test).start();
        }
    }
}
