package Lection_17.Java_Design_Patterns.Examples.Composite.Leafs;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component c: children) {
            System.out.println(c.name);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }


    @Override
    public void remove(Component component) {
        children.remove(component);
    }
}
