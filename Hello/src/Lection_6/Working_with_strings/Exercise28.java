package Lection_6.Working_with_strings;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner entireText = new Scanner(System.in);
        String str;
        str = entireText.nextLine();
        String[] words = str.split("[^a-zA-Zà-ÿÀ-ß]+");
        String resultText = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int lengthOfWord = word.length();
            if (lengthOfWord > 0) {
                resultText += word.charAt(lengthOfWord - 1);
            }
        }
        System.out.print(resultText);
    }
}

