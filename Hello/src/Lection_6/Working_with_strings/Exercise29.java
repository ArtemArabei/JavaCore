package Lection_6.Working_with_strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise29 {
    public void findHexadecimalNumber(String word) {
        System.out.println("Первоначальная строка выглядит так: \n" + word);
        Pattern p = Pattern.compile("0x[\\dA-Fa-f]+");
        Matcher matcher = p.matcher(word);
        System.out.println("Ответ:");
        while (matcher.find()) {
            int i = matcher.start();
            int j = matcher.end();
            System.out.println(word.substring(i, j));
        }
    }

    public static void main(String[] args) {
        Exercise29 search = new Exercise29();
        Scanner entireText = new Scanner(System.in);
        String word;
        word = entireText.nextLine();
        search.findHexadecimalNumber(word);
    }
}
