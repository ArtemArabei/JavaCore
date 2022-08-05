package Lection_4.Cycles.Arrays;

import java.util.Random;

public class TestLoops {
    public static void main(String[] args) {
        Loops loops = new Loops();
        int n = 12; // ���� ������ �����, ������� ���������� �������� � �������
        int sqr = loops.getSqr(n);
        System.out.println("�������� �����: " + n);
        System.out.println("�����:" + "\n" + "������� ������� �����: " + sqr);
        System.out.println();
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        System.out.println("������ A ������� �� ��������� �����: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(10);
        }
        System.out.println("������ B ������� �� ��������� �����: ");
        for (int element : b) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            c[i] = rand.nextInt(10);
        }
        System.out.println("������ C ������� �� ��������� �����: ");
        for (int element : c) {
            System.out.print(element + " ");
        }
        System.out.println();
        int res = loops.getMaxSumArray(a, b, c);
        System.out.println("�����:");
        switch (res) {
            case 1:
            case 2:
            case 3:
                System.out.println("������������ ����� ��������� � ������� " +
                        "��� �������: " + res);
                break;
            case 4:
                System.out.println("������������ ����� ��������� � �������� " +
                        "��� �������� 1 � 2");
                break;
            case 5:
                System.out.println("������������ ����� ��������� � �������� " +
                        "��� �������� 1 � 3");
                break;
            case 6:
                System.out.println("������������ ����� ��������� � �������� " +
                        "��� �������� 2 � 3");
                break;
            case 7:
                System.out.println("������������ ����� ��������� ���������� " +
                        "������������ �� ���� ��������");
                break;
        }
    }
}
