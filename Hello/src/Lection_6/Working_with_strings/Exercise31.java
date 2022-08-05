package Lection_6.Working_with_strings;

public class Exercise31 {
    public void addMillionTimes(String word) {
        String wordSum = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            wordSum += word;
        }
        System.out.println("Прошло " + (System.currentTimeMillis()
                - startTime) + " милисекунд");
    }

    public void appendMillionTimes(String word) {
        StringBuilder strBuilder = new StringBuilder(word);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strBuilder.append(word);
        }
        String wordSum = strBuilder.toString();
        System.out.println("Прошло " + (System.currentTimeMillis()
                - startTime) + " милисекунд");
    }

    public static void main(String[] args) {
        Exercise31 speed = new Exercise31();
        String word = "aaabbbccc";
        speed.addMillionTimes(word);
        speed.appendMillionTimes(word);
    }
}
