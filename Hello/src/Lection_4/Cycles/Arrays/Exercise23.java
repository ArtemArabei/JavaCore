package Lection_4.Cycles.Arrays;

public class Exercise23 {
    public static void main(String[] args) {
        /*данная программа позволяет нарисовать "бабочку" для любого размера
        массива в пределах указанного типа*/
        int size = 10; // здесь задаем размеры поля "бабочки"
        int[][] butterfly = new int[size][size];
        for (int i = 0; i <= butterfly.length / 2; i++) {
            for (int j = 0; j <= butterfly[i].length / 2; j++) {
                if ((i - j) > 0)
                    butterfly[i][j] = 0;
                else {
                    butterfly[i][j] = 1;
                    butterfly[i][butterfly[i].length - 1 - j] = 1;
                }
            }
        }
        for (int i = butterfly.length - 1; i >= butterfly.length / 2; i--) {
            for (int j = butterfly[i].length - 1; j >= butterfly[i].length /
                    2; j--) {
                if ((i - j) < 0)
                    butterfly[i][j] = 0;
                else {
                    butterfly[i][j] = 1;
                    butterfly[i][butterfly[i].length - 1 - j] = 1;
                }
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j] + " ");
            }
            System.out.println();
        }
    }
}
