package Lection_11.Exceptions;

public class Exercise43 {
    public static void main(String[] args) {
        try {
            String testString = null;
            testString.toString();
        } catch (java.lang.NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Необходимо присвоить строке значение, " +
                    "отличное от null");
        }
    }
}
