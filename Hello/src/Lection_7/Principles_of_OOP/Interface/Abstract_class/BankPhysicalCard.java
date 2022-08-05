package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public abstract class BankPhysicalCard extends BankCard {

    BankPhysicalCard(int balance) {
        super(balance);
    }

    @Override
    void isMaterial() {
        System.out.println("Карточка материальна. Будьте осторожны - можно " +
                "потерять!");
    }

    @Override
    abstract void getBalance();
}
