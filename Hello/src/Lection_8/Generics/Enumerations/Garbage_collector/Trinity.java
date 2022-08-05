package Lection_8.Generics.Enumerations.Garbage_collector;

import java.util.Scanner;

public class Trinity<S, D, C> {
    private S season;
    private D description;
    private C countOfDays;

    public Trinity(S season, D description, C countOfDays) {
        this.season = season;
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public S getSeason() {
        return season;
    }

    public D getDescription() {
        return description;
    }

    public C getCountOfDays() {
        return countOfDays;
    }

    public static void printStartSeasons(Trinity<Seasons, String,
            Integer>[] scheduler) {
        System.out.println("��������� �������� ������� ���� �������� ���:");
        for (Trinity s : scheduler) {
            System.out.println("�����: " + s.getSeason() + "\t ��������: "
                    + s.getDescription() + "\t ���������� ���� � ������ "
                    + s.getCountOfDays());
        }
    }

    public static void printSeasons(Trinity<Seasons, String,
            Integer>[] scheduler) {
        System.out.println("\n������� ������� 35:");
        for (Trinity s : scheduler) {
            System.out.print(s.getSeason() + "\t");
        }
        System.out.println();
    }

    public static void printNextSeason(Trinity<Seasons, String,
            Integer>[] scheduler) {
        System.out.println("\n������� ������� 36:");
        System.out.println("������� ����� �� 1 �� 4, ������� ����� " +
                "��������������� ������ ���� �� ��������� ����");
        Scanner entireText = new Scanner(System.in);
        int number;
        number = entireText.nextInt();
        if ((number > 0) && (number < 5)) {
            if (number < scheduler.length) {
                System.out.print("�����, ��������� �� ������� ��� ������� "
                        + number + " ��� - " + scheduler[number].getSeason());
            } else
                System.out.print(scheduler[0].getSeason());
        } else
            System.out.print("��������� ����� �� ������������� ���������� " +
                    "���������");
        System.out.println();
    }

    public static void printCountOfDays(Trinity<Seasons, String,
            Integer>[] scheduler) {
        System.out.println("\n������� ������� 37:");
        System.out.println("������� ����� �� 1 �� 4, ������� ����� " +
                "��������������� ������ ���� �� ��������� ����");
        Scanner entireText = new Scanner(System.in);
        int number;
        number = entireText.nextInt();
        if ((number > 0) && (number < 5)) {
            System.out.println("���������� ���� � ������, ��������������� " +
                    "���������� ������, ���������� "
                    + scheduler[number - 1].getCountOfDays());
        } else
            System.out.println("��������� ����� �� ������������� ���������� " +
                    "���������");
    }
}
