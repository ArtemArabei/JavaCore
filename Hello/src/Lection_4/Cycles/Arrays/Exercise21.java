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
        System.out.println("������ ������� �� ��������� �����: ");
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
        System.out.println("������ ������������� �������� �� ������ �������: "
                + indexOfMaxFromStart);
        System.out.println("������ ������������ �������� �� ������ �������: "
                + indexOfMinFromStart);
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[indexOfMaxFromEnd]) {
                indexOfMaxFromEnd = i;
            } else if (array[i] <= array[indexOfMinFromEnd]) {
                indexOfMinFromEnd = i;
            }
        }
        System.out.println("������ ������������� �������� �� ����� �������: "
                + indexOfMaxFromEnd);
        System.out.println("������ ������������ �������� �� ����� �������: "
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
        System.out.println("��������� ������ - " + finishIndex
                + ", �������� " + "������ - " + startIndex
                + ", ���������� - " + Math.absExact(startIndex - finishIndex));
        System.out.println("�����:");
        System.out.println("����� ������������� ���������� ��������� " +
                "�������, ������������� ����� ����������� � ������������ " +
                "����������, ����������: " + sum);
    }
}
