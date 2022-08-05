package Lection_11.Exceptions;

public class NullListException extends Exception {
    public NullListException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
