package Lection_11.Exceptions;

public class NotValidNumberOfArgumentsException extends Exception {
    public NotValidNumberOfArgumentsException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
