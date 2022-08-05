package Lection_16.LocalDate.Stream_API;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {
        int n = 25;
        Optional<Integer> minValue = Stream.iterate(2, x -> x + 2)
                .limit(n)
                .filter(x -> (2 * x < n) && x > 10)
                .findFirst();
        System.out.println(minValue);
    }
}
