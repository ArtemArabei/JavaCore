package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class BankCreditCard extends BankPhysicalCard {

    BankCreditCard(int balance) {
        super(balance);
    }

    @Override
    void getBalance() {
        System.out.println("На карточке установлен лимит в " + balance
                + " долларов) но Вы еще и с дебетовой не все потратили)");
        System.out.println();
    }
}
