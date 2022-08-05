package Lection_4.Cycles.Arrays;

public class Cycles {


    static void printFirstFiveElements(int count) {
        for (int j = 1; j <= count; j++) {
            for (int i = 1; i <= count; i++) {
                System.out.println(i);
                if (i == 5)
                    break;
            }
            System.out.println("j = " + j);
        }

        System.out.println("Ñ‏הא ןנמדנאללא םו המרכא");
    }

    public static void main(String[] args) {
        printFirstFiveElements(10);

       /* for (; ; ) {
            System.out.println("Infinite loop!");
        }*/

    }
}

