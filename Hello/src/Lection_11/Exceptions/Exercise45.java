package Lection_11.Exceptions;

import java.util.Scanner;

public class Exercise45 {
    void createText() throws TooLargeTextException {
        Scanner entireText = new Scanner(System.in);
        String text;
        text = entireText.nextLine();
        printText(text);
    }

    void printText(String text) throws TooLargeTextException {
        if (text.length() > 20) {
            throw new TooLargeTextException("Текст слишком длинный и не " +
                    "может быть выведен на экран (можно до 20 символов)");
        } else System.out.println(text);
    }


    public static void main(String[] args) {
        Exercise45 printing = new Exercise45();
        try {
            printing.createText();
        } catch (TooLargeTextException e) {
        }
    }
}
