package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int buffer = 0;
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Массив состоит из следующих чисел:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int j = 0; j <= (array.length / 2 - 1); j++) {
            buffer = array[j];
            array[j] = array[(array.length - 1 - j)];
            array[(array.length - 1 - j)] = buffer;
        }
        System.out.println("После переворота массив выглядит так:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
