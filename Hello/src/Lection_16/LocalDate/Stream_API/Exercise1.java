package Lection_16.LocalDate.Stream_API;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        Set<String> strings = Stream.generate(() -> (int) ((Math.random() * 10
                        + 1)))
                .limit(100)
                .filter(p -> p%2 == 0)
                .map(String::valueOf)
                .collect(Collectors.toSet());
        System.out.println(strings);
    }
}
