package Lection_4.Cycles.Arrays;

import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {
        // �������� �������
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("initial array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " ");
        }

        // ���������� � ������� �������� ������� 10
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        System.out.println("new array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        System.out.println(); // ������ ������� ������


        // ���������� ������� ����������� ������� �������
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // ������ ������� �������� �������
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        System.out.println("sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }



    }
}
