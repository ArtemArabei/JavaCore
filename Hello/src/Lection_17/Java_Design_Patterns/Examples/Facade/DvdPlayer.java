package Lection_17.Java_Design_Patterns.Examples.Facade;

public class DvdPlayer {
    public void powerOn() {
        System.out.println("���-������������� �������");
    }

    public void connectToTv() {
        System.out.println("���-������������� ��������� � ��");
    }

    public void startMovie() {
        System.out.println("�������� �����");
    }

    public void endMovie() {
        System.out.println("�������� �������");
    }

    public void powerOff() {
        System.out.println("���-������������� ��������");
    }
}
