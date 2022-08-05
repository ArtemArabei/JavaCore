package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

import java.util.Scanner;

public class CashMachine {

    private static int twentyDollarNote;
    private static int fiftyDollarNote;
    private static int hundredDollarNote;
    private static int amountOfMoney;

    public CashMachine(int twentyDollarNote, int fiftyDollarNote,
                       int hundredDollarNote) {
        this.twentyDollarNote = twentyDollarNote;
        this.fiftyDollarNote = fiftyDollarNote;
        this.hundredDollarNote = hundredDollarNote;
    }

    public static void cashIn() {
        twentyDollarNote = (int) (Math.random() * 333);
        fiftyDollarNote = (int) (Math.random() * 333);
        hundredDollarNote = (int) (Math.random() * 333);
        System.out.println("Изначально в банкомат загружено "
                + twentyDollarNote + " 20-долларовых банкнот, "
                + fiftyDollarNote + " 50-долларовых банкнот, "
                + hundredDollarNote + " 100-долларовых банкнот.");
        amountOfMoney = twentyDollarNote * 20 + fiftyDollarNote * 50
                + hundredDollarNote * 100;
        System.out.println("Общая сумма денег в банкомате " + amountOfMoney
                + " долларов.");
    }

    public static boolean cashOut() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, которую желаете снять в долларах:");
        int desiredAmountOfMoney = in.nextInt();
        boolean isPossible = false;
        int iBuf = 0;
        int jBuf = 0;
        int kBuf = 0;
        for (int i = 0; i <= hundredDollarNote; i++) {
            for (int j = 0; j <= fiftyDollarNote; j++) {
                for (int k = 0; k <= twentyDollarNote; k++) {
                    if ((i * 100 + j * 50 + k * 20) == desiredAmountOfMoney) {
                        isPossible = true;
                        iBuf = i;
                        jBuf = j;
                        kBuf = k;
                        i = hundredDollarNote;
                        j = fiftyDollarNote;
                        break;
                    }
                }
            }
        }
        if (isPossible == true) {
            System.out.print("Вы успешно сняли " + desiredAmountOfMoney
                    + " долларов ");
            System.out.println("следующими купюрами: " + kBuf
                    + " 20-долларовых банкнот, " + jBuf
                    + " 50-долларовых банкнот, " + iBuf
                    + " 100-долларовых банкнот.");
            twentyDollarNote = twentyDollarNote - kBuf;
            fiftyDollarNote = fiftyDollarNote - jBuf;
            hundredDollarNote = hundredDollarNote - iBuf;
            System.out.println("В банкомате осталось " + twentyDollarNote
                    + " 20-долларовых банкнот, " + fiftyDollarNote
                    + " 50-долларовых банкнот, " + hundredDollarNote
                    + " 100-долларовых банкнот.");
            amountOfMoney = twentyDollarNote * 20 + fiftyDollarNote * 50
                    + hundredDollarNote * 100;
            System.out.println("Оставшаяся сумма денег в банкомате "
                    + amountOfMoney + " долларов.");
        } else {
            System.out.println("Данную сумму снять невозможно - недостаточно" +
                    " купюр");
            System.out.println("Выберите другую сумму в пределах "
                    + amountOfMoney + " долларов, либо закажите срочную " +
                    "загрузку наличности в банкомат");
        }
        return isPossible;
    }
}
