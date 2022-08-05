package Lection_6.Working_with_strings;

import  java.lang.String;

public class Palindrome {

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        System.out.println(word);
        boolean isPalindrome = false;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                isPalindrome = true;
            } else
                isPalindrome = false;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Palindrome newPalindrome = new Palindrome();
        String word = "Шалаш1";
        System.out.println(newPalindrome.isPalindrome(word));
    }
}
