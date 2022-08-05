package Lection_12.Input_and_Output_Stream;

public class FileCanNotBeWrittenException extends Throwable {
    public FileCanNotBeWrittenException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
