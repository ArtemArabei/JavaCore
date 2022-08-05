package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class CalculateTwo implements Calculate {

    @Override
    public int multiply(int a, int b) {
        int res = 0;
        for (int i = 0; i < b; i++)
            res += a;
        return res;
    }

    @Override
    public int divide(int a, int b) {
        int i;
        for (i = 0; a >= b; i++)
            a = a - b;
        return i;
    }

    public static void main(String[] args) {
        Calculate two = new CalculateTwo();
        System.out.println(two.multiply(5, 6));
        System.out.println(two.divide(30, 6));
    }
}
