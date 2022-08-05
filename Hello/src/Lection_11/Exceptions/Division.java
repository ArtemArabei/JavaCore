package Lection_11.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {

    public List<Integer> createList() {
        Scanner entireText = new Scanner(System.in);
        String str;
        System.out.println("��� �������� ������ �� ��������� null ������� " +
                "null, ��� �������� � ���������� ������ ������� ����� ������" +
                " ��������");
        str = entireText.nextLine();
        List<Integer> arguments = new ArrayList();
        if (str.equals("null")) {
            arguments = null;
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("������� ���������� ����� � ������");
            int possibleNumberOfNumbers = in.nextInt();
            // ��������� ���������� ����� � ������ List
            for (int i = 0; i < possibleNumberOfNumbers; i++) {
                System.out.println("������� ����� �� 0 �� 99 � ������, ��� " +
                        "����� �������� null ������� ����� 100");
                int number = in.nextInt();
                if (number == 100) {
                    arguments.add(null);
                } else
                    arguments.add(number);
            }
        }
        System.out.println("������ �������� ���:");
        System.out.println(arguments);
        return arguments;
    }

    public Integer divide(List<Integer> arguments) throws NullListException,
            NotValidNumberOfArgumentsException, NullArgumentException,
            DivisionByZeroException {
        int result;
        if (arguments == null) {
            throw new NullListException("������ ����� �������� null");
        }
        if (!(arguments.size() > 1)) {
            throw new NotValidNumberOfArgumentsException("� ������ " +
                    "���������� ������ 2 �����");
        }
        if (arguments.get(0) == null || arguments.get(1) == null) {
            throw new NullArgumentException("������ �/��� ������ ����� " +
                    "������ ����� �������� null");
        }
        if (arguments.get(1) == 0) {
            throw new DivisionByZeroException("������ ����� ������ �����" +
                    " �������� 0, �� 0 ������ ������");
        }
        result = arguments.get(0) / arguments.get(1);
        return result;
    }
}
