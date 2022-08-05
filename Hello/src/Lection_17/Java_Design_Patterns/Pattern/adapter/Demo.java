package Lection_17.Java_Design_Patterns.Pattern.adapter;

public class Demo {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Круглый столбик радиусом " + rpeg.getRadius() + " влезает в ямку радиусом " + hole.getRadius());
        } else System.out.println("Круглый столбик радиусом " + rpeg.getRadius() + " не влезает в ямку радиусом " + hole.getRadius());

        RoundHole hole2 = new RoundHole(6);
        RoundPeg rpeg2 = new RoundPeg(7);
        if (hole2.fits(rpeg2)) {
            System.out.println("Круглый столбик радиусом " + rpeg2.getRadius() + " влезает в ямку радиусом " + hole2.getRadius());
        } else System.out.println("Круглый столбик радиусом " + rpeg2.getRadius() + " не влезает в ямку радиусом " + hole2.getRadius());

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg smallSqPeg2 = new SquarePeg(7);
        SquarePeg smallSqPeg3 = new SquarePeg(8);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter smallSqPegAdapter2 = new SquarePegAdapter(smallSqPeg2);
        SquarePegAdapter smallSqPegAdapter3 = new SquarePegAdapter(smallSqPeg3);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Квадратный столбик со стороной " + smallSqPeg.getWidth() + " влезает в ямку радиусом " + hole.getRadius());
        } else System.out.println("Квадратный столбик со стороной " + smallSqPeg.getWidth() + " не влезает в ямку радиусом " + hole.getRadius());
        if (hole.fits(smallSqPegAdapter2)) {
            System.out.println("Квадратный столбик со стороной " + smallSqPeg2.getWidth() + " влезает в ямку радиусом " + hole.getRadius());
        } else System.out.println("Квадратный столбик со стороной " + smallSqPeg2.getWidth() + " не влезает в ямку радиусом " + hole.getRadius());
        if (hole.fits(smallSqPegAdapter3)) {
            System.out.println("Квадратный столбик со стороной " + smallSqPeg3.getWidth() + " влезает в ямку радиусом " + hole.getRadius());
        } else System.out.println("Квадратный столбик со стороной " + smallSqPeg3.getWidth() + " не влезает в ямку радиусом " + hole.getRadius());
        if (hole.fits(largeSqPegAdapter)) {
            System.out.println("Квадратный столбик со стороной " + largeSqPeg.getWidth() + " влезает в ямку радиусом " + hole.getRadius());
        } else System.out.println("Квадратный столбик со стороной " + largeSqPeg.getWidth() + " не влезает в ямку радиусом " + hole.getRadius());
    }
}
