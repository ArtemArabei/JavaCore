package Lection_21;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(601) - 300;
        }
        System.out.println("Массив состоит из следующих чисел: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        int maxValue = -301;
        int minValue = 301;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("\nМаксимальное число в массиве равно " + maxValue);
        System.out.println("Минимальное число в массиве равно " + minValue);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) array[i] = minValue;
        }
        System.out.println("Теперь массив состоит из следующих чисел: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
