package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        int indexOfMaxFromStart = 0;
        int indexOfMinFromStart = 0;
        int indexOfMaxFromEnd = 0;
        int indexOfMinFromEnd = 0;
        int startIndex = 0;
        int finishIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Массив состоит из следующих чисел: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMaxFromStart]) {
                indexOfMaxFromStart = i;
            } else if (array[i] < array[indexOfMinFromStart]) {
                indexOfMinFromStart = i;
            }
        }
        System.out.println("Индекс максимального значения от начала массива: "
                + indexOfMaxFromStart);
        System.out.println("Индекс минимального значения от начала массива: "
                + indexOfMinFromStart);
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[indexOfMaxFromEnd]) {
                indexOfMaxFromEnd = i;
            } else if (array[i] <= array[indexOfMinFromEnd]) {
                indexOfMinFromEnd = i;
            }
        }
        System.out.println("Индекс максимального значения от конца массива: "
                + indexOfMaxFromEnd);
        System.out.println("Индекс минимального значения от конца массива: "
                + indexOfMinFromEnd);
        if (Math.absExact(indexOfMinFromStart - indexOfMaxFromEnd)
                > Math.absExact(indexOfMaxFromStart - indexOfMinFromEnd)) {
            startIndex = indexOfMinFromStart;
            finishIndex = indexOfMaxFromEnd;
        } else {
            startIndex = indexOfMinFromEnd;
            finishIndex = indexOfMaxFromStart;
        }
        if (startIndex < finishIndex) {
            for (int i = startIndex + 1; i <= finishIndex - 1; i++) {
                sum = sum + array[i];
            }
        } else {
            for (int i = finishIndex + 1; i <= startIndex - 1; i++) {
                sum = sum + array[i];
            }
        }
        System.out.println("Начальный индекс - " + finishIndex
                + ", конечный " + "индекс - " + startIndex
                + ", расстояние - " + Math.absExact(startIndex - finishIndex));
        System.out.println("ОТВЕТ:");
        System.out.println("Сумма максимального количества элементов " +
                "массива, расположенных между минимальным и максимальным " +
                "значениями, составляет: " + sum);
    }
}
