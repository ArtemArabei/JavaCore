package Lection_6.Working_with_strings;

public class Reverse {
    public String clearNumbersAndRotate(String word) {
        System.out.println("Первоначальная строка выглядит так: \n" + word);
        word = word.replaceAll("\\d", "");
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = word.charAt(i) + result;
        }
        System.out.println("После обработки строка выглядит так: ");
        return result;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String word = "To1 be2,3 or4 not5 to6 be7,8 that9 is0 the1 question2:";
        System.out.println(reverse.clearNumbersAndRotate(word));
    }
}
