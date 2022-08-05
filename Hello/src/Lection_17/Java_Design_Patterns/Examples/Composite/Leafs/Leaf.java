package Lection_17.Java_Design_Patterns.Examples.Composite.Leafs;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void add(Component c) {
    }

    @Override
    public void remove(Component c) {

    }
}
