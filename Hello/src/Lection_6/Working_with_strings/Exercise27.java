package Lection_6.Working_with_strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner entireText = new Scanner(System.in);
        String str;
        str = entireText.nextLine();
        str  = str.trim();
        int count = 1;
        Pattern p = Pattern.compile(" +");
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
