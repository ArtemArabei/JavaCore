package Lection_17.Java_Design_Patterns.Examples.Composite.Leafs;

public class DemoComposite {
    public static void main(String[] args) {
        Component root = new Composite("Root");
        Component leaf = new Leaf("Leaf");
        Composite subtree = new Composite("Subtree");
        root.add(leaf);
        root.add(subtree);
        root.display();
    }
}
