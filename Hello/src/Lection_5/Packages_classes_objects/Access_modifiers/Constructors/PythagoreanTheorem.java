package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class PythagoreanTheorem {
    private int hyp;

    public int getHyp(int k1, int k2) {
        hyp = (int) Math.round(Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2)));
        return hyp;
    }
}
