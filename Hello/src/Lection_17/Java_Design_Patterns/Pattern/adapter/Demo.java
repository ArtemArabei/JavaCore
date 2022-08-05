package Lection_17.Java_Design_Patterns.Pattern.adapter;

public class Demo {
    public static void main(String[] args) {
        // ������� � �������� � �� ��������.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("������� ������� �������� " + rpeg.getRadius() + " ������� � ���� �������� " + hole.getRadius());
        } else System.out.println("������� ������� �������� " + rpeg.getRadius() + " �� ������� � ���� �������� " + hole.getRadius());

        RoundHole hole2 = new RoundHole(6);
        RoundPeg rpeg2 = new RoundPeg(7);
        if (hole2.fits(rpeg2)) {
            System.out.println("������� ������� �������� " + rpeg2.getRadius() + " ������� � ���� �������� " + hole2.getRadius());
        } else System.out.println("������� ������� �������� " + rpeg2.getRadius() + " �� ������� � ���� �������� " + hole2.getRadius());

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg smallSqPeg2 = new SquarePeg(7);
        SquarePeg smallSqPeg3 = new SquarePeg(8);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // �� ��������������.

        // ������� ����� ��������.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter smallSqPegAdapter2 = new SquarePegAdapter(smallSqPeg2);
        SquarePegAdapter smallSqPegAdapter3 = new SquarePegAdapter(smallSqPeg3);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("���������� ������� �� �������� " + smallSqPeg.getWidth() + " ������� � ���� �������� " + hole.getRadius());
        } else System.out.println("���������� ������� �� �������� " + smallSqPeg.getWidth() + " �� ������� � ���� �������� " + hole.getRadius());
        if (hole.fits(smallSqPegAdapter2)) {
            System.out.println("���������� ������� �� �������� " + smallSqPeg2.getWidth() + " ������� � ���� �������� " + hole.getRadius());
        } else System.out.println("���������� ������� �� �������� " + smallSqPeg2.getWidth() + " �� ������� � ���� �������� " + hole.getRadius());
        if (hole.fits(smallSqPegAdapter3)) {
            System.out.println("���������� ������� �� �������� " + smallSqPeg3.getWidth() + " ������� � ���� �������� " + hole.getRadius());
        } else System.out.println("���������� ������� �� �������� " + smallSqPeg3.getWidth() + " �� ������� � ���� �������� " + hole.getRadius());
        if (hole.fits(largeSqPegAdapter)) {
            System.out.println("���������� ������� �� �������� " + largeSqPeg.getWidth() + " ������� � ���� �������� " + hole.getRadius());
        } else System.out.println("���������� ������� �� �������� " + largeSqPeg.getWidth() + " �� ������� � ���� �������� " + hole.getRadius());
    }
}
