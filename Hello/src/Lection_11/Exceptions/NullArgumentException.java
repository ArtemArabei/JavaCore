package Lection_11.Exceptions;

public class NullArgumentException extends Exception {
    public NullArgumentException(String s) {
        System.out.println("��������� ���������: " + s);
    }
}
