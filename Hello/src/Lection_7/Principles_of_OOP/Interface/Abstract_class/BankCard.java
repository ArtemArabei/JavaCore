package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public abstract class BankCard {

    int balance;

    BankCard(int balance) {
        this.balance = balance;
    }

    abstract void isMaterial();

    abstract void getBalance();

    public static void main(String[] args) {
        BankCard visa = new BankDebetCard(1000000);
        visa.isMaterial();
        visa.getBalance();
        BankCard maestro = new BankCreditCard(1000000);
        maestro.isMaterial();
        maestro.getBalance();
        BankCard mastercard = new BankVirtualCard(1000000);
        mastercard.isMaterial();
        mastercard.getBalance();
    }
}
