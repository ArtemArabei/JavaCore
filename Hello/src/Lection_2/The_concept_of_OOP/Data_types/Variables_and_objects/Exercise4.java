package Lection_2.The_concept_of_OOP.Data_types.Variables_and_objects;

public class Exercise4 {
    public static int result(int a, int b) {
        return (a + b) + a * b;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(result(a, b));
    }
}