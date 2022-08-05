package Lection_3.Operators.Control_Operators;

public class Exercise11 {

    public static int generateDay() {
        int day = (int) (Math.random() * 7) + 1;
        return day;
    }

    public static String getSchedule(int day) {
        String schedule= "";
        switch (day) {
            case 1:
                schedule = "������� �����������: ������ � 18.00 �� ����� � " +
                        "����� � ������������ �����";
                break;
            case 2:
                schedule = "������� �������: � 22.00 ������ - ��������� ����" +
                        " ���������!";
                break;
            case 3:
                schedule = "������� �����: � 22.00 ��������� - ���� - " +
                        "��������� ���� - ��������� ���� ���������!!!";
                break;
            case 4:
                schedule = "������� �������: �� �������� ��� ����� � 18.00!";
                break;
            case 5:
                schedule = "������� �������: ����� ����� � ��������� �� �����";
                break;
            case 6:
                schedule = "������� �������: ����� ������ �� � ������";
                break;
            case 7:
                schedule = "������� �����������: ���� ������������ � �����";
                break;
        }
        return schedule;
    }

    public static void main(String[] args) {
        int day = generateDay();
        System.out.println("���������� ����� ��� ������ - " + day);
        String schedule = getSchedule(day);
        System.out.print("����������: \n" + schedule);
    }
}
