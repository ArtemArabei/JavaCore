package Lection_12.Input_and_Output_Stream;

public class NumberNotFoundException extends Throwable {
    public NumberNotFoundException(String s) {
        System.out.println("Результат следующий: " + s);
    }
}
