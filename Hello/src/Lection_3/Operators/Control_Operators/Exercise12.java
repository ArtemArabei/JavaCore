package Lection_3.Operators.Control_Operators;

public class Exercise12 {
    public static void main(String[] args) {
        int number = 1;
        int product = 1;
        while (number <= 10) {
            product = product * number;
            number++;
        }
        System.out.println("��������� ����� ����� �� 0 �� 10 �����: "
                + product);
    }
}
