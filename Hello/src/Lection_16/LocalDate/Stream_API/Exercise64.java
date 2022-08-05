package Lection_16.LocalDate.Stream_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите номер мес€ца");
        int numberOfMonth = in.nextInt();
        LocalDate theDay = LocalDate.of(2022, numberOfMonth, 1);
        System.out.println("¬се даты выбранного мес€ца:");
        Stream.iterate(theDay.withDayOfMonth(1), t -> t.plusDays(1))
                .limit(theDay.lengthOfMonth())
                .peek((p) -> System.out.println(p.format
                        (DateTimeFormatter.ofPattern("d::MMM::uuuu"))))
                .count();
    }
}
