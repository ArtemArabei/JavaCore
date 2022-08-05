package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class BankVirtualCard extends BankCard {
    BankVirtualCard(int balance) {
        super(balance);
    }

    @Override
    void isMaterial() {
        System.out.println("Карточка нематериальна. Будьте осторожны - легко" +
                " потерять к ней доступ!");
    }

    @Override
    void getBalance() {
        System.out.println("На виртуальной карте баланс составляет "
                + balance + " долларов");
        System.out.println();
    }
}
