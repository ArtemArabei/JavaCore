package Lection_4.Cycles.Arrays;

import java.util.Random;

public class Exercise21_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        int indexOfMaxFromStart = 0;
        int indexOfMinFromStart = 0;
        int indexOfMaxFromEnd = 0;
        int indexOfMinFromEnd = 0;
        int startIndex = 0;
        int finishIndex = 0;
        int distance = 0;
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

        if (Math.absExact(indexOfMaxFromStart - indexOfMinFromStart)
                > distance) {
            startIndex = indexOfMinFromStart;
            finishIndex = indexOfMaxFromStart;
            distance = Math.absExact(indexOfMaxFromStart
                    - indexOfMinFromStart);
        }

        if (Math.absExact(indexOfMaxFromStart - indexOfMinFromEnd)
                > distance) {
            startIndex = indexOfMinFromEnd;
            finishIndex = indexOfMaxFromStart;
            distance = Math.absExact(indexOfMaxFromStart - indexOfMinFromEnd);
        }

        if (Math.absExact(indexOfMaxFromEnd - indexOfMinFromEnd) > distance) {
            startIndex = indexOfMinFromEnd;
            finishIndex = indexOfMaxFromEnd;
            distance = Math.absExact(indexOfMaxFromEnd - indexOfMinFromEnd);
        }

        if (Math.absExact(indexOfMaxFromEnd - indexOfMinFromStart)
                > distance) {
            startIndex = indexOfMinFromStart;
            finishIndex = indexOfMaxFromEnd;
            distance = Math.absExact(indexOfMaxFromEnd - indexOfMinFromStart);
        }

        if (startIndex < finishIndex) {
            for (int i = startIndex + 1; i <= finishIndex - 1; i++) {
                sum = sum + array[i];
            }
            System.out.println("��������� ������ - " + startIndex
                    + ", �������� " + "������ - " + finishIndex
                    + ", ���������� - " + distance);
        } else {
            for (int i = finishIndex + 1; i <= startIndex - 1; i++) {
                sum = sum + array[i];
            }
            System.out.println("��������� ������ - " + finishIndex
                    + ", �������� " + "������ - " + startIndex
                    + ", ���������� - " + distance);
        }
        System.out.println("�����:");
        System.out.println("����� ������������� ���������� ��������� " +
                "�������, ������������� ����� ����������� � ������������ " +
                "����������, ����������: " + sum);
    }
}
