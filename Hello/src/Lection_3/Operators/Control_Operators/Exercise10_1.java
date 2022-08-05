package Lection_3.Operators.Control_Operators;

public class Exercise10_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        int c = (int) (Math.random() * 100) + 1;
        int d = (int) (Math.random() * 100) + 1;
        int e = (int) (Math.random() * 200) + 1;
        int f = (int) (Math.random() * 200) + 1;
        System.out.println("Размеры первого дома " + a + " на " + b);
        System.out.println("Размеры второго дома " + c + " на " + d);
        System.out.println("Размеры участка " + e + " на " + f);
        String result;
        if ((((a + c) <= e) && (b <= f) && (d <= f)) ||
                (((a + d) <= e) && (b <= f) && (c <= f)) ||
                (((a + c) <= f) && (b <= e) && (d <= e)) ||
                (((a + d) <= f) && (b <= e) && (c <= e)) ||
                (((b + c) <= e) && (a <= f) && (d <= f)) ||
                (((b + d) <= e) && (a <= f) && (c <= f)) ||
                (((b + c) <= f) && (a <= e) && (d <= e)) ||
                (((b + d) <= f) && (a <= e) && (c <= e)))
            result = "Данные два дома помещаются на данном участке";
        else
            result = "Данные два дома НЕ помещаются на данном участке";
        System.out.println(result);
    }
}