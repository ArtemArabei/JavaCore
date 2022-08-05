package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class TestPythagoreanTheorem {
    public static void main(String[] args) {
        PythagoreanTheorem findHyp = new PythagoreanTheorem();
        System.out.println(findHyp.getHyp(5, 4));
    }
}
