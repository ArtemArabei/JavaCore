package Lection_17.Java_Design_Patterns.Examples.LogisticApp;

public abstract class LogisticsApp {

    public void createLogistic() {
        Transport transport = createTransport();
        transport.deliver();
    }

    /**
     * ��������� ����� �������������� ���� �����, ����� ��������� ����������
     * ������� ���������, ������ ��� ������ �������.
     */
    public abstract Transport createTransport();
}
