package Lection_13.Threads;

import java.util.Arrays;
import java.util.Random;

public class Exercise53 extends Thread {

    public void run() {
        System.out.println(getName() + ": �������� ������������� �������� " +
                "�������: " + findMaxNumber(generateArray()));
    }

    public int[] generateArray() {
        int numberOfNumbers = 10; // ���������� ����� ����� � �������
        int maxValue = 1000; // ������������ �������� ����� ����� (���
        // ��������� ��������)
        Random rand = new Random();
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        System.out.println(getName() + ": ������ ������� �� ��������� �����: "
                + Arrays.toString(array));
        return array;
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Exercise53 myThreadi = new Exercise53();
            myThreadi.start();
        }
    }
}
