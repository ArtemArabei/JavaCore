package Lection_3.Operators.Control_Operators;

public class Exercise6 {

    public static boolean checkIsSeven(int startNumber) {
        return startNumber % 10 == 7;
    }

    public static void main(String[] args) {
        int startNumber = (int) (Math.random() * Integer.MAX_VALUE);
        System.out.print("Ќачальное число - " + startNumber
                + "\nявл€етс€ ли последн€€ цифра числа семеркой? - "
                + checkIsSeven(startNumber));
    }
}
