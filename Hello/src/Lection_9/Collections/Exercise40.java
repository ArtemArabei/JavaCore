package Lection_9.Collections;

import java.util.*;

public class Exercise40 {
    public static void main(String[] args) {
        int numberOfNumbers = 50; // количество целых чисел в коллекции
        int maxValue = 10; // максимальное значение целых чисел (для
        // диапазона значений)
        List randomNumbers = new ArrayList();
        System.out.println("Стартовая коллекция выглядит так:");
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers.add((int) (Math.random() * (maxValue + 1)));
        }
        System.out.println(randomNumbers);
        Set<Integer> randomUniqueNumbers = new LinkedHashSet<>(randomNumbers);
        System.out.println("После удаления повторов коллекция выглядит так:");
        System.out.println(randomUniqueNumbers);
    }
}
