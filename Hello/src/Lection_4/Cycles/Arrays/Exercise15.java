package Lection_4.Cycles.Arrays;

public class Exercise15 {
    public static void main(String[] args) {
        int startAmount = 0;
        int finishAmount = 2; // ����� �� ����� ������� ����� ��� �����
        int startNumber = 50; // ������ ��������� �����
        int finishNumber = 70; // ����� ��������� �����
        for (int inputNumber = startNumber; inputNumber <= finishNumber;
             inputNumber++) {
            int primeNumber = inputNumber;
            for (int divisor = 2; divisor < inputNumber; divisor++) {
                if (inputNumber % divisor == 0) {
                    primeNumber = 0;
                    break;
                }
            }
            if (primeNumber != 0) {
                startAmount++;
            }
            if (startAmount == finishAmount) {
                System.out.println("� ��������� ����� ����� �� " + startNumber
                        + " �� " + finishNumber + " ������� ������ ��� " +
                        "������� " + finishAmount + " �������� �����: "
                        + primeNumber);
                break;
            }
        }
    }
}

