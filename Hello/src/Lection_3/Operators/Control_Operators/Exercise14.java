package Lection_3.Operators.Control_Operators;

public class Exercise14 {
    public static void main(String[] args) {
        long number = 7893823445L;
        long sum = 0;
        long digit = 0;
        do {
            digit = number % 10;
            number = (number - digit) / 10;
            sum = sum + digit;
        }
        while (number > 0);
        System.out.println("Сумма цифр числа 7893823445 равна: " + sum);
    }
}
