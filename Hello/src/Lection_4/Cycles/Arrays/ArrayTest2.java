package Lection_4.Cycles.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest2 {

    public static void main(String[] args) {
 int[] values = new int[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println("Минимальное значение " + values[0] + "\n" + "Максимальное значение " + values[values.length - 1]);
        System.out.println(values.length);
        for (int element : values) {
            System.out.print(element);
        }

        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        System.out.println(array[0][1]);
    }
}
