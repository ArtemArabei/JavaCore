package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class BankVirtualCard extends BankCard {
    BankVirtualCard(int balance) {
        super(balance);
    }

    @Override
    void isMaterial() {
        System.out.println("�������� �������������. ������ ��������� - �����" +
                " �������� � ��� ������!");
    }

    @Override
    void getBalance() {
        System.out.println("�� ����������� ����� ������ ���������� "
                + balance + " ��������");
        System.out.println();
    }
}
