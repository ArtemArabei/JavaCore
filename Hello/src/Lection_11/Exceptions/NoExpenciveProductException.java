package Lection_11.Exceptions;

public class NoExpenciveProductException extends Exception {
    public NoExpenciveProductException(String s) {
        System.out.println(s);
    }
}
