package Lection_8.Generics.Enumerations.Garbage_collector;

import java.util.Arrays;

public enum Seasons {
    SPRING("����� - ������ ��������,�������� �������", 92),
    SUMMER("���� - ����, ��������� ����! �� ����� �������� �������", 92),
    AUTUMN("����� - ������ ����! ���� ����������!", 91),
    WINTER("���� - ����� � ������, ���� ��������!", 90);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Seasons.values()));
    }
}
