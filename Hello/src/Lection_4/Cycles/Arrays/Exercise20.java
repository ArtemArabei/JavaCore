package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxValue = 0;
        int position = 0;
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Массив состоит из следующих чисел: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
                position = j;
            }
        }
        System.out.println("\n" + "Индекс максимального элемента массива: "
                + position);
    }
}
