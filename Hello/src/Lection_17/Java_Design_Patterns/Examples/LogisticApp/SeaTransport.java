package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public class SeaTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("���� ������ �� �������� �����");
        System.out.println("���� ��������� �����");
    }
}
