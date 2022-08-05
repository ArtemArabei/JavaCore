package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class CalculateOne implements Calculate {

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculate one = new CalculateOne();
        System.out.println(one.multiply(7, 6));
        System.out.println(one.divide(60, 6));
    }
}
