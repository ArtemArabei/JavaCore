package Lection_13.Threads;

import java.util.ArrayList;
import java.util.List;

public class Exercise52 extends Thread {

    public void run() {
        int numberOfNumbers = 10; // ���������� ����� ����� � ���������
        int maxValue = 10000; // ������������ �������� ����� ����� (���
        // ��������� ��������)
        int sum = 0;
        List randomNumbers = new ArrayList();
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add((int) (Math.random() * (maxValue + 1)));
            sum = sum + (int) randomNumbers.get(i);
        }
        System.out.println(getName() + ": ��������� ��������� �������� ���: "
                + randomNumbers + ",  \t������� �������������� ��������� " +
                "�����: " + sum / numberOfNumbers);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Exercise52 myThreadi = new Exercise52();
            myThreadi.start();
        }
    }
}
