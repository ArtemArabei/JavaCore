package Lection_3.Operators.Control_Operators;

public class Exercise10_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        int c = (int) (Math.random() * 100) + 1;
        int d = (int) (Math.random() * 100) + 1;
        int e = (int) (Math.random() * 200) + 1;
        int f = (int) (Math.random() * 200) + 1;
        System.out.println("������� ������� ���� " + a + " �� " + b);
        System.out.println("������� ������� ���� " + c + " �� " + d);
        System.out.println("������� ������� " + e + " �� " + f);
        String result;
        if ((((a + c) <= e) && (b <= f) && (d <= f)) ||
                (((a + d) <= e) && (b <= f) && (c <= f)) ||
                (((a + c) <= f) && (b <= e) && (d <= e)) ||
                (((a + d) <= f) && (b <= e) && (c <= e)) ||
                (((b + c) <= e) && (a <= f) && (d <= f)) ||
                (((b + d) <= e) && (a <= f) && (c <= f)) ||
                (((b + c) <= f) && (a <= e) && (d <= e)) ||
                (((b + d) <= f) && (a <= e) && (c <= e)))
            result = "������ ��� ���� ���������� �� ������ �������";
        else
            result = "������ ��� ���� �� ���������� �� ������ �������";
        System.out.println(result);
    }
}