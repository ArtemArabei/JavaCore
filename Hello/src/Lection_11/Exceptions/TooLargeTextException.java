package Lection_11.Exceptions;

public class TooLargeTextException extends Exception {
    public TooLargeTextException(String s) {
        System.out.println(s);
    }
}
