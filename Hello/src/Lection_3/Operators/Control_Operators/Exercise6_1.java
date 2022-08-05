package Lection_3.Operators.Control_Operators;

public class Exercise6_1 {
    public static void main(String[] args) {
        int startNumber = (int)(Math.random() * Integer.MAX_VALUE);
        boolean isSeven = startNumber % 10 == 7;
        System.out.println("Ќачальное число - " + startNumber + "\nявл€етс€ ли последн€€ цифра числа семеркой? - " + isSeven);
    }
}
