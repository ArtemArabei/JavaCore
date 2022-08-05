package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public class AbstractTennisFactoryDemo {
    public static void main(String[] args) {
        TennisEquipmentFactory tableTennisFactory =
                new TableTennisEquipmentFactory();
        TennisEquipment tableTennis =
                new TableTennisEquipment(tableTennisFactory);
        System.out.println(tableTennis);

        TennisEquipmentFactory bigTennisFactory =
                new BigTennisEquipmentFactory();
        TennisEquipment bigTennis = new BigTennisEquipment(bigTennisFactory);
        System.out.println(bigTennis);
    }
}
