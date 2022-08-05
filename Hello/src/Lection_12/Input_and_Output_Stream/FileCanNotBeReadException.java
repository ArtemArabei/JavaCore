package Lection_12.Input_and_Output_Stream;

public class FileCanNotBeReadException extends Throwable {
    public FileCanNotBeReadException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
