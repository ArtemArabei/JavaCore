package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class BankCreditCard extends BankPhysicalCard {

    BankCreditCard(int balance) {
        super(balance);
    }

    @Override
    void getBalance() {
        System.out.println("�� �������� ���������� ����� � " + balance
                + " ��������) �� �� ��� � � ��������� �� ��� ���������)");
        System.out.println();
    }
}
