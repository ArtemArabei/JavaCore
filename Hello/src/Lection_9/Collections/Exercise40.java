package Lection_9.Collections;

import java.util.*;

public class Exercise40 {
    public static void main(String[] args) {
        int numberOfNumbers = 50; // ���������� ����� ����� � ���������
        int maxValue = 10; // ������������ �������� ����� ����� (���
        // ��������� ��������)
        List randomNumbers = new ArrayList();
        System.out.println("��������� ��������� �������� ���:");
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add((int) (Math.random() * (maxValue + 1)));
        }
        System.out.println(randomNumbers);
        Set<Integer> randomUniqueNumbers = new LinkedHashSet<>(randomNumbers);
        System.out.println("����� �������� �������� ��������� �������� ���:");
        System.out.println(randomUniqueNumbers);
    }
}
