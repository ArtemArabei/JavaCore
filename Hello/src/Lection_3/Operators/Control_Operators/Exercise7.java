package Lection_3.Operators.Control_Operators;

public class Exercise7 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int r = (int) (Math.random() * 50);
        System.out.println("������� �������������� ��������� " + a + " �� "
                + b);
        System.out.println("������ ������� �������� " + r);
        String result;
        if (a * a + b * b <= r * r * 4)
            result = "����� ������� ������ ��������� ������ ���������";
        else
            result = "���������� ������� ������ ��������� ������ ���������";
        System.out.println(result);
    }
}
