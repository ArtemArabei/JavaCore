package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

import java.util.Scanner;

public class CashMachine {

    private static int twentyDollarNote;
    private static int fiftyDollarNote;
    private static int hundredDollarNote;
    private static int amountOfMoney;

    public CashMachine(int twentyDollarNote, int fiftyDollarNote,
                       int hundredDollarNote) {
        this.twentyDollarNote = twentyDollarNote;
        this.fiftyDollarNote = fiftyDollarNote;
        this.hundredDollarNote = hundredDollarNote;
    }

    public static void cashIn() {
        twentyDollarNote = (int) (Math.random() * 333);
        fiftyDollarNote = (int) (Math.random() * 333);
        hundredDollarNote = (int) (Math.random() * 333);
        System.out.println("���������� � �������� ��������� "
                + twentyDollarNote + " 20-���������� �������, "
                + fiftyDollarNote + " 50-���������� �������, "
                + hundredDollarNote + " 100-���������� �������.");
        amountOfMoney = twentyDollarNote * 20 + fiftyDollarNote * 50
                + hundredDollarNote * 100;
        System.out.println("����� ����� ����� � ��������� " + amountOfMoney
                + " ��������.");
    }

    public static boolean cashOut() {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����, ������� ������� ����� � ��������:");
        int desiredAmountOfMoney = in.nextInt();
        boolean isPossible = false;
        int iBuf = 0;
        int jBuf = 0;
        int kBuf = 0;
        for (int i = 0; i <= hundredDollarNote; i++) {
            for (int j = 0; j <= fiftyDollarNote; j++) {
                for (int k = 0; k <= twentyDollarNote; k++) {
                    if ((i * 100 + j * 50 + k * 20) == desiredAmountOfMoney) {
                        isPossible = true;
                        iBuf = i;
                        jBuf = j;
                        kBuf = k;
                        i = hundredDollarNote;
                        j = fiftyDollarNote;
                        break;
                    }
                }
            }
        }
        if (isPossible == true) {
            System.out.print("�� ������� ����� " + desiredAmountOfMoney
                    + " �������� ");
            System.out.println("���������� ��������: " + kBuf
                    + " 20-���������� �������, " + jBuf
                    + " 50-���������� �������, " + iBuf
                    + " 100-���������� �������.");
            twentyDollarNote = twentyDollarNote - kBuf;
            fiftyDollarNote = fiftyDollarNote - jBuf;
            hundredDollarNote = hundredDollarNote - iBuf;
            System.out.println("� ��������� �������� " + twentyDollarNote
                    + " 20-���������� �������, " + fiftyDollarNote
                    + " 50-���������� �������, " + hundredDollarNote
                    + " 100-���������� �������.");
            amountOfMoney = twentyDollarNote * 20 + fiftyDollarNote * 50
                    + hundredDollarNote * 100;
            System.out.println("���������� ����� ����� � ��������� "
                    + amountOfMoney + " ��������.");
        } else {
            System.out.println("������ ����� ����� ���������� - ������������" +
                    " �����");
            System.out.println("�������� ������ ����� � �������� "
                    + amountOfMoney + " ��������, ���� �������� ������� " +
                    "�������� ���������� � ��������");
        }
        return isPossible;
    }
}
