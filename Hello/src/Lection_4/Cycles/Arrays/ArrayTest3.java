package Lection_4.Cycles.Arrays;

import java.util.Random;
public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] array = new int[10][2];
        int sum = 0;
        System.out.println(array.length);
        System.out.println(array[1].length);
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print(array[i][j] + " ");
                sum = sum + array[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
