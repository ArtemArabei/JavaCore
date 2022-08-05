package Lection_4.Cycles.Arrays;

import java.util.Random;

public class TestLoops2 {
        public static void main(String[] args) {
            Loops2 loops = new Loops2();
            System.out.println();
            int[] a = new int[1];
            int[] b = new int[1];
            int[] c = new int[1];
            Random rand = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(3);
            }
            System.out.println("Массив A состоит из следующих чисел: ");
            for (int element : a) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                b[i] = rand.nextInt(3);
            }
            System.out.println("Массив B состоит из следующих чисел: ");
            for (int element : b) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (int i = 0; i < c.length; i++) {
                c[i] = rand.nextInt(3);
            }
            System.out.println("Массив C состоит из следующих чисел: ");
            for (int element : c) {
                System.out.print(element + " ");
            }
            System.out.println();
            int res = loops.getMaxSumArray(a, b, c);
            System.out.println("ОТВЕТ:");

            System.out.println("Максимальная сумма элементов в массивах " +
                    "под номерами:");
            if((res & 0B100) != 0)
                System.out.println("1");
            if((res & 0B010) != 0)
                System.out.println("2");
            if((res & 0B001) != 0)
                System.out.println("3");
        }
    }

