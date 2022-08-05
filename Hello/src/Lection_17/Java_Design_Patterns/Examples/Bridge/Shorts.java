package Lection_17.Java_Design_Patterns.Examples.Bridge;

public class Shorts extends Clothes {

    public Shorts(Color color, Size size) {
        super(color, size);
    }

    @Override
    public String make() {
        return "����� �����. " + color.fill() + size.select();
    }
}