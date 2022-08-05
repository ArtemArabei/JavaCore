package Lection_3.Operators.Control_Operators;

public class Exercise7 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int r = (int) (Math.random() * 50);
        System.out.println("Размеры прямоугольного отверстия " + a + " на "
                + b);
        System.out.println("Радиус круглой картонки " + r);
        String result;
        if (a * a + b * b <= r * r * 4)
            result = "Можно закрыть данное отверстие данной картонкой";
        else
            result = "Невозможно закрыть данное отверстие данной картонкой";
        System.out.println(result);
    }
}
