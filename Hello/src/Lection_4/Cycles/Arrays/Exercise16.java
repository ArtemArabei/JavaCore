package Lection_4.Cycles.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        int startNumber = 1; // начало диапазона чисел
        int finishNumber = 100; // конец диапазона чисел
        for (int inputNumber = startNumber; inputNumber <= finishNumber;
             inputNumber++) {
            if (inputNumber % 7 == 0)
                System.out.println("Число " + inputNumber + " - " + "Hope!*");
        }
        System.out.println("* Это значит, что данное число делится на 7 без " +
                "остатка");
    }
}
