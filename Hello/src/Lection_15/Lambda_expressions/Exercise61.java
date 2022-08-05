package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Exercise61 {
    public static void main(String[] args) {
        List<Double> inches = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            inches.add((double) i);
        }

        DoWhatYouWant<Double> printConvertSum = (list) -> {
            double sum = 0;
            System.out.println("��� ������ �������� �� 1 �� 20 ������ " +
                    "������� ������������� ��������� �������� � ������:");
            for (double i : list) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                    sum += i;
                }
            }
            System.out.println("\n��� ������������� ��������� ��������� � " +
                    "�����������:");
            for (double i : list) {
                if (i % 2 == 0) {
                    System.out.print(i * 2.54 + ", ");
                }
            }
            return sum * 2.54;
        };

        System.out.println("\n����� ��������� �������� � ����������� " +
                "���������:\n" + printConvertSum.doSomething(inches));
    }
}

interface DoWhatYouWant<T> {
    T doSomething(List<T> list);
}
