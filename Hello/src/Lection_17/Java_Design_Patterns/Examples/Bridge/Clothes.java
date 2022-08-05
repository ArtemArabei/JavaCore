package Lection_17.Java_Design_Patterns.Examples.Bridge;

public abstract class Clothes {
    protected Color color;
    protected Size size;

    public Clothes(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    abstract public String make();
}

