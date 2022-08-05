package Lection_17.Java_Design_Patterns.Examples.Bridge;

public class Large implements Size {
    @Override
    public String select() {
        return "Размер большой";
    }
}
