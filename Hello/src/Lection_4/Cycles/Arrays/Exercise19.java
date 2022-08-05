package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise19 {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("������ ������� �� ��������� �����:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println("�� ������ �������� ����� ��������� ��������:");
        for (int j = 0; j < array.length; j++) {
            if ((j + 1) % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
    }
}
