package Lection_9.Collections;

import java.util.*;

public class Exercise42 {

    public static void main(String[] args) {
        Scanner entireText = new Scanner(System.in);
        String str;
        str = entireText.nextLine();
        str = str.trim();
        String[] words = str.split("[^a-zA-Zа-яА-Яё]+");
        Map<String, Integer> repeatedWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (repeatedWords.get(words[i]) != null) {
                repeatedWords.put(words[i], repeatedWords.get(words[i]) + 1);
            } else {
                repeatedWords.put(words[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : repeatedWords.entrySet()) {
            System.out.println("Слово: " + entry.getKey()
                    + " \t\tКоличество повторений: " + entry.getValue());
        }
    }
}
