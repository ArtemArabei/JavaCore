package Lection_4.Cycles.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        int startNumber = 1; // ������ ��������� �����
        int finishNumber = 100; // ����� ��������� �����
        for (int inputNumber = startNumber; inputNumber <= finishNumber;
             inputNumber++) {
            if (inputNumber % 7 == 0)
                System.out.println("����� " + inputNumber + " - " + "Hope!*");
        }
        System.out.println("* ��� ������, ��� ������ ����� ������� �� 7 ��� " +
                "�������");
    }
}
