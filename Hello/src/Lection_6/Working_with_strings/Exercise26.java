package Lection_6.Working_with_strings;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        char[] symbol = {'.', ',', '!', '?', ':', ';', '-'};
        Scanner entireText = new Scanner(System.in);
        String str;
        str = entireText.nextLine();
        char[] text = str.toCharArray();
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (text[i] == symbol[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
