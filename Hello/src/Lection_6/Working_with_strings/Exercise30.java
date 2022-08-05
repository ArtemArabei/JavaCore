package Lection_6.Working_with_strings;

import java.util.Scanner;

public class Exercise30 {
    public void findTags(String word) {
        word = word.replaceAll("<p[^>]+>", "<p>");
        System.out.println(word);
    }

    public static void main(String[] args) {
        Exercise30 search = new Exercise30();
        Scanner entireText = new Scanner(System.in);
        String word;
        word = entireText.nextLine();
        search.findTags(word);
    }
}
