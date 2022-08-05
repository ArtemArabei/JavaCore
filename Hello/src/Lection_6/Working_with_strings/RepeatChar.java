package Lection_6.Working_with_strings;

public class RepeatChar {

    public String repeatChar(String word) {
        System.out.println("Первоначальная строка выглядит так: \n" + word);
        String result = "После преобразования строка выглядит так: \n";
        for (int i = 1; i < word.length(); i++) {
            Boolean ReturnValue = Character.isDigit(word.charAt(i));
            if (ReturnValue) {
                int l = word.charAt(i) - '0';
                if (l > 0) {
                    for (int j = 0; j < l; j++) {
                        result = result + word.charAt(i - 1);
                    }
                }
            } else {
                result = result + word.charAt(i - 1);
            }
        }
        result = result.replaceAll("\\d", "");
        return result;
    }

    public static void main(String[] args) {
        RepeatChar repeat = new RepeatChar();
        String word = "d34 2Aa1ba3c6e0";
        System.out.println(repeat.repeatChar(word));
    }
}
