package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("������ ������� �� ��������� �����: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "��������� ������� ������� ���: "
                + array[array.length - 1]);
    }
}
