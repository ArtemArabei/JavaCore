package Lection_4.Cycles.Arrays;

public class Exercise17 {
        public static void main(String[] args) {
            int randomNumber = (int) (Math.random() * Integer.MAX_VALUE);
            int count = 0;
            String accountingStandartOfNumber = "";
            System.out.println("Произвольное число: " + randomNumber + "\n");
            for (int numberLength = String.valueOf(randomNumber).length();
                    numberLength > 0; numberLength--) {
                String buffer = String.valueOf(randomNumber % 10);
                if (count % 3 == 0)
                    accountingStandartOfNumber = buffer + " "
                            + accountingStandartOfNumber;
                else accountingStandartOfNumber = buffer
                        + accountingStandartOfNumber;
                count ++;
                randomNumber = (randomNumber - randomNumber % 10) / 10;
            }
            System.out.println("Произвольное число в бухгалтерском формате: "
                    + accountingStandartOfNumber);
        }
}
