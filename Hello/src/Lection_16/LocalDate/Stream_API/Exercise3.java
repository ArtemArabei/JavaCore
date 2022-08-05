package Lection_16.LocalDate.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sumArray = numbers.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println("Сумма элементов равна " + sumArray);
    }
}
