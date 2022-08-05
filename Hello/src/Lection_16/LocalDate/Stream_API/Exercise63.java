package Lection_16.LocalDate.Stream_API;

import java.util.TreeSet;

public class Exercise63 {
    public static void main(String[] args) {
        int n = 10; // количество элементов коллекции
        int minValue = 1;
        int maxValue = 100;
        System.out.println("Стартовая коллекция целых чисел выглядит так:");
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            numbers.add((int) (Math.random() * (maxValue - minValue + 1))
                    + minValue);
        }
        System.out.println(numbers);
        System.out.println(numbers.stream()
                .anyMatch((p) -> (p % 3 == 0 && p % 5 == 0)));
    }
}
