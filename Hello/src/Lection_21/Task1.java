package Lection_21;

public class Task1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 1000);
        System.out.println("x= " + x);
        int y = (int) (Math.random() * 1000);
        System.out.println("y= " + y);
        int z = (int) (Math.random() * 1000);
        System.out.println("z= " + z);
        if (x > z) {
            System.out.println("����� x � y ����� " + (x + y));
        } else if (z > y) {
            System.out.println("������� �������������� ���� ����� ����� "
                    + (x + y + z) / 3.0);
        } else System.out.println("������� �� ������� y �� z ����� " + y % z);
    }
}
