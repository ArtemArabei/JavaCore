package Lection_8.Generics.Enumerations.Garbage_collector;

import java.util.Arrays;

public enum Seasons {
    SPRING("Весна - Травка зеленеет,солнышко блестит…", 92),
    SUMMER("Лето - Лето, сказочное лето! От чудес кружится голова…", 92),
    AUTUMN("Осень - Унылая пора! Очей очарованье!", 91),
    WINTER("Зима - Мороз и солнце, день чудесный!", 90);

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
