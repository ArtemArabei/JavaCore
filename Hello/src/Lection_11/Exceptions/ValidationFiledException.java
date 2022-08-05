package Lection_11.Exceptions;

public class ValidationFiledException extends Exception {
    public ValidationFiledException(String s) {
        System.out.println(s);
    }
}
