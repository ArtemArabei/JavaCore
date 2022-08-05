package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class CashMachineTest {
    public static void main(String[] args) {
        CashMachine atm1 = new CashMachine(0,0,0);
        CashMachine.cashIn();
        System.out.println(CashMachine.cashOut());
    }
}
