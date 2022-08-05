package Lection_17.Java_Design_Patterns.Examples.Bridge;

public class Printed implements Color {
    @Override
    public String fill() {
        return "С рисунком. ";
    }
}