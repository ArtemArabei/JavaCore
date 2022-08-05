package Lection_17.Java_Design_Patterns.Examples.Composite.Leafs;

abstract class Component {
    protected String name;

    public Component(String name)
    {
        this.name = name;
    }

    public abstract void display();
    public abstract void add(Component c);
    public abstract void remove(Component c);
}