package Lection_3.Operators.Control_Operators;

public class Exercise13 {
    public static void main(String[] args) {
        int number = 1;
        double product = 1.0d;
        do {
            product = product * number;
            number++;
        }
        while (number <= 25);
        System.out.println("Произведение чисел от 0 до 25 равно: " + product);
    }
}
