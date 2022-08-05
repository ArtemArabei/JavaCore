package Lection_4.Cycles.Arrays;

public class Exercise15 {
    public static void main(String[] args) {
        int startAmount = 0;
        int finishAmount = 2; // какое по счету простое число нам нужно
        int startNumber = 50; // начало диапазона чисел
        int finishNumber = 70; // конец диапазона чисел
        for (int inputNumber = startNumber; inputNumber <= finishNumber;
             inputNumber++) {
            int primeNumber = inputNumber;
            for (int divisor = 2; divisor < inputNumber; divisor++) {
                if (inputNumber % divisor == 0) {
                    primeNumber = 0;
                    break;
                }
            }
            if (primeNumber != 0) {
                startAmount++;
            }
            if (startAmount == finishAmount) {
                System.out.println("В диапазоне целых чисел от " + startNumber
                        + " до " + finishNumber + " простым числом под " +
                        "номером " + finishAmount + " является число: "
                        + primeNumber);
                break;
            }
        }
    }
}

