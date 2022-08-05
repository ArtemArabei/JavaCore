package Lection_6.Working_with_strings;

public class RepeatChars {
    public String repeatChars(String word) {
        System.out.println("Первоначальная строка выглядит так: \n" + word);
        String word1 = word.replaceAll("[^0-9]+", " ");
        word1 = word1.trim();
        String result = "После преобразования строка выглядит так: \n";
        String[] letters = word.split("[0-9]+");
        String[] numbers = word1.split("[ ]");
        int digits[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            digits[j] = Integer.parseInt(numbers[j]);
        }
        if (letters.length <= numbers.length) {
            for (int k = 0; k < letters.length; k++) {
                for (int l = 1; l < digits[k] + 1; l++) {
                    result = result + letters[k];
                }
            }
            return result;
        } else {
            for (int k = 0; k < letters.length - 1; k++) {
                for (int l = 1; l < digits[k] + 1; l++) {
                    result = result + letters[k];
                }
            }
            result = result + letters[letters.length - 1];
            return result;
        }
    }

    public static void main(String[] args) {
        RepeatChars repeat = new RepeatChars();
        String word = " Aa1ba.10d6c";
        System.out.println(repeat.repeatChars(word));
    }
}
