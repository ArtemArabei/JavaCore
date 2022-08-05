package Lection_17.Java_Design_Patterns.Examples.Bridge;

public class Shirt extends Clothes {

    public Shirt(Color color, Size size) {
        super(color, size);
    }

    @Override
    public String make() {
        return "Сшита футболка. " + color.fill() + size.select();
    }
}