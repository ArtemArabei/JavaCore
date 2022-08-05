package Lection_11.Exceptions;

public class PasswordNotConfirmException extends Exception {
    public PasswordNotConfirmException(String s) {
        System.out.println(s);
    }
}
