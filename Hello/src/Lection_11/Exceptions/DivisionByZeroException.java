package Lection_11.Exceptions;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
