package Lection_16.LocalDate.Stream_API;

import java.time.LocalDate;

public class Exercise66 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня - " + today);
        System.out.println("60 дней назад было - " + today.minusDays(60));
    }
}
