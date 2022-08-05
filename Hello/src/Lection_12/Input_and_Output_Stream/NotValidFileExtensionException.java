package Lection_12.Input_and_Output_Stream;

public class NotValidFileExtensionException extends Throwable {
    public NotValidFileExtensionException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
