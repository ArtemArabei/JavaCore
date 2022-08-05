package Lection_15.Lambda_expressions;

import java.util.function.Supplier;

import static java.lang.Math.random;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int) (random() * 11);

        for (int i = 0; i < 50; i++) {
            System.out.print(randomNumber.get() + ", ");
        }
    }
}
