package Lection_16.LocalDate.Stream_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestDateTime {
    public static void main(String[] args) {
        LocalDate dateOfMyBirth = LocalDate.of(1987, 7, 25);
        LocalDate dateOfMySonBirth = LocalDate.of(2020, 10, 14);
        System.out.println(dateOfMyBirth);
        System.out.println(dateOfMySonBirth);
        LocalDateTime dateTimeOfMyBirth = dateOfMyBirth.atTime(1,50,9);
        LocalDateTime dateTimeOfMySonBirth = dateOfMySonBirth.atTime(12,30,5);
        long years = ChronoUnit.YEARS.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        long months = ChronoUnit.MONTHS.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        long days = ChronoUnit.DAYS.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        long hours = ChronoUnit.HOURS.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        long minutes = ChronoUnit.MINUTES.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        long seconds = ChronoUnit.SECONDS.between(dateTimeOfMyBirth, dateTimeOfMySonBirth);
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy: HH.mm.ss");
        String formatDateTime = dateOfMyBirth.format(format);
        System.out.println(formatDateTime);
        String formatDateTime2 = dateOfMySonBirth.format(format);
        System.out.println(formatDateTime2);


    }
}
