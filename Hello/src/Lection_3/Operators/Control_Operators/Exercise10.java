package Lection_3.Operators.Control_Operators;

public class Exercise10 {
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
        if (((a + c) <= e) && (b <= f) && (d <= f))
            result = "������ ��� ���� ���������� �� ������ �������";
        else {
            if (((a + d) <= e) && (b <= f) && (c <= f))
                result = "������ ��� ���� ���������� �� ������ �������";
            else {
                if (((a + c) <= f) && (b <= e) && (d <= e))
                    result = "������ ��� ���� ���������� �� ������ �������";
                else {
                    if (((a + d) <= f) && (b <= e) && (c <= e))
                        result = "������ ��� ���� ���������� �� ������ " +
                                "�������";
                    else {
                        if (((b + c) <= e) && (a <= f) && (d <= f))
                            result = "������ ��� ���� ���������� �� ������ " +
                                    "�������";
                        else {
                            if (((b + d) <= e) && (a <= f) && (c <= f))
                                result = "������ ��� ���� ���������� �� " +
                                        "������ �������";
                            else {
                                if (((b + c) <= f) && (a <= e) && (d <= e))
                                    result = "������ ��� ���� ���������� �� " +
                                            "������ �������";
                                else {
                                    if (((b + d) <= f) && (a <= e) && (c <= e))
                                        result = "������ ��� ���� ����������" +
                                                " �� ������ �������";
                                    else
                                        result = "������ ��� ���� �� " +
                                                "���������� �� ������ �������";
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
