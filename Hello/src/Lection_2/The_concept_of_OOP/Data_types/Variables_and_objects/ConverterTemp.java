package Lection_2.The_concept_of_OOP.Data_types.Variables_and_objects;

public class ConverterTemp {
    public static double convCtoK(double c) {
        return c + 273.1;
    }
    public static double convCtoF(double c) {
        return c * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        double tempC=0;
        System.out.println(convCtoK(tempC));
        System.out.println(convCtoF(tempC));
    }
}