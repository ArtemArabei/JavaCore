package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        List<Integer> testNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            testNumbers.add(rand.nextInt(11) - 5);
        System.out.println("Массив цифр для тестирования лямбда-выражений:");
        System.out.println(testNumbers);

        Function<Integer, String> positiveOrNegative = x -> {
            if (x > 0) return "Число положительное";
            else {
                if (x < 0) return "Число отрицательное";
                else return "Ноль";
            }
        };

        for (Integer i : testNumbers) {
            System.out.println(i + " - " + positiveOrNegative.apply(i));
        }
    }
}
