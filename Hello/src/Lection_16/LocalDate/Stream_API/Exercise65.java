package Lection_16.LocalDate.Stream_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Exercise65 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.
                ofPattern("dd-MM-yyyy HH:mm");
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("������ " + now.format(format));
        LocalDateTime timeOfMeeting = today.atTime(13, 00, 00);
        LocalDateTime limit = now.plusMonths(2);
        System.out.println("����� 2 ������ ����� " + limit.format(format));
        System.out.println("� ��������� 2 ������ ������������� ��������� " +
                "�������:");
        while (timeOfMeeting.isBefore(limit)) {
            System.out.println(timeOfMeeting.format(format)
                    + " ������������� ������������ ������� � ���������");
            timeOfMeeting = timeOfMeeting.plusDays(7);
        }
    }
}
