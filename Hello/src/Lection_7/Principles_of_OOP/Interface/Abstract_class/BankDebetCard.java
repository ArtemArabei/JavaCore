package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class BankDebetCard extends BankPhysicalCard {

    BankDebetCard(int balance) {
        super(balance);
    }

    @Override
    void getBalance() {
        System.out.println("������ �� �������� ���������� " + balance
                + " ��������) ������� �� ��������!");
        System.out.println();
    }
}
