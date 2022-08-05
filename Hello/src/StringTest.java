import  java.lang.String;

public class StringTest {
    String getFormatLogin(String str) {
        str = str.trim();
        str = str.toLowerCase();
        return str;
    }

    String replaceSecondWord(String str1, String str2) {
        String str3 = str1.substring(0, str1.indexOf(" ") + 1);
        int spaceIndex = str1.indexOf(" ");
        String secondWord = str1.substring(spaceIndex);
        System.out.println(str3);
        System.out.println(secondWord);
        if (secondWord.equals(str2)) {
            return "It doesn't make sense";
        } else
            return str3 + str2;
    }

    public static void main(String[] args) {
        StringTest testOfString = new StringTest();
        String str = " Hi, everybody! Let's play! ";
        String str1 = "Hello World!";
        String str2 = " World!";
        System.out.println(testOfString.getFormatLogin(str));
        System.out.println(testOfString.replaceSecondWord(str1, str2));
        }
    }

